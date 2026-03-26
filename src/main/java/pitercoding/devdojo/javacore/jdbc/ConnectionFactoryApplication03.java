package pitercoding.devdojo.javacore.jdbc;

import lombok.extern.log4j.Log4j2;
import pitercoding.devdojo.javacore.jdbc.domain.Producer;
import pitercoding.devdojo.javacore.jdbc.service.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionFactoryApplication03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Toei Animation").build();
        Producer producer2 = Producer.builder().name("White Fox").build();
        Producer producer3 = Producer.builder().name("Studio Ghibli").build();
        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
