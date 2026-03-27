package pitercoding.devdojo.javacore.jdbc.repository;

import pitercoding.devdojo.javacore.jdbc.conn.ConnectionFactory;
import pitercoding.devdojo.javacore.jdbc.domain.Anime;
import pitercoding.devdojo.javacore.jdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProducerRepositoryRowSet {

    public static List<Anime> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE ?;";
        List<Anime> producers = new ArrayList<>();
        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, "%" + name + "%");
            jrs.execute();
            while (jrs.next()) {
                Anime producer = Anime.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
        return producers;
    }

//    public static void updateJdbcRowSet(Producer producer) {
//        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
//        List<Producer> producers = new ArrayList<>();
//        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
//            jrs.setCommand(sql);
//            jrs.setString(1, producer.getName());
//            jrs.setInt(2, producer.getId());
//            jrs.execute();
//        } catch (SQLException e) {
//            throw  new RuntimeException(e);
//        }
//    }

    public static void updateJdbcRowSet(Anime producer) {
        String sql = "SELECT * FROM anime_store.producer WHERE (`id` = ?);";
        List<Anime> producers = new ArrayList<>();
        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if (!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }

    public static void updateCachedRowSet(Anime producer) {
        String sql = "SELECT * FROM producer WHERE (`id` = ?);";
        try(CachedRowSet crs = ConnectionFactory.getCashedRowSet();
            Connection connection = ConnectionFactory.getConnection()) {
            connection.setAutoCommit(false);
            crs.addRowSetListener(new CustomRowSetListener());
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection);
            if (!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();
            TimeUnit.SECONDS.sleep(10);
            crs.acceptChanges(connection);
        } catch (SQLException | InterruptedException e) {
            throw  new RuntimeException(e);
        }
    }
}
