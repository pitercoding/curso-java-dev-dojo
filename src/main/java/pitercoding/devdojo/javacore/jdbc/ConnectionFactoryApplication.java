package pitercoding.devdojo.javacore.jdbc;

import lombok.extern.log4j.Log4j2;
import pitercoding.devdojo.javacore.jdbc.domain.Producer;
import pitercoding.devdojo.javacore.jdbc.service.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionFactoryApplication {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        // ProducerService.save(producer);
        // ProducerService.delete(4);
        // ProducerService.update(producerToUpdate);

        // List<Producer> producers = ProducerService.findAll();
        // List<Producer> producers = ProducerService.findByName("Mad");
        //log.info("Producers found: '{}'", producers);

        // ProducerService.showProducerMetaData();
        // ProducerService.showDriverMetaData();
        // ProducerService.showTypeScrollWorking();
        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
        log.info("Producers found: '{}'", producers);
    }
}
