package pitercoding.devdojo.javacore.jdbc.service;

import pitercoding.devdojo.javacore.jdbc.domain.Anime;
import pitercoding.devdojo.javacore.jdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Anime> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Anime producer) {
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }

    public static void updateCachedRowSet(Anime producer) {
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }

}
