package pitercoding.devdojo.javacore.jdbc;

import lombok.extern.log4j.Log4j2;
import pitercoding.devdojo.javacore.jdbc.domain.Anime;
import pitercoding.devdojo.javacore.jdbc.service.ProducerServiceRowSet;

@Log4j2
public class ConnectionFactoryApplication02 {
    public static void main(String[] args) {

        Anime producerToUpdate = Anime.builder().id(1).name("MAD2").build();
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("---------------------------");
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
//        log.info("producers:{}", producers);
    }
}
