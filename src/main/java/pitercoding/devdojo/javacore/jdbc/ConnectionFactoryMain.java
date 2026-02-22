package pitercoding.devdojo.javacore.jdbc;

import pitercoding.devdojo.javacore.jdbc.domain.Producer;
import pitercoding.devdojo.javacore.jdbc.service.ProducerService;

public class ConnectionFactoryMain {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        // ProducerService.save(producer);
        // ProducerService.delete(4);
        ProducerService.update(producerToUpdate);

    }
}
