package pitercoding.devdojo.javacore.jdbc.service;

import pitercoding.devdojo.javacore.jdbc.conn.ConnectionFactory;
import pitercoding.devdojo.javacore.jdbc.domain.Producer;
import pitercoding.devdojo.javacore.jdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }

}
