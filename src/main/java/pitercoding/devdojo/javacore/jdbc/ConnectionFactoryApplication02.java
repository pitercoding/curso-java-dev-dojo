package pitercoding.devdojo.javacore.jdbc;

import lombok.extern.log4j.Log4j2;
import pitercoding.devdojo.javacore.jdbc.domain.Producer;
import pitercoding.devdojo.javacore.jdbc.repository.ProducerRepositoryRowSet;
import pitercoding.devdojo.javacore.jdbc.service.ProducerServiceRowSet;

import java.util.List;

@Log4j2
public class ConnectionFactoryApplication02 {
    public static void main(String[] args) {

        Producer producerToUpdate = Producer.builder().id(1).name("MAD2").build();
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("---------------------------");
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
//        log.info("producers:{}", producers);
    }
}
