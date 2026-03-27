package pitercoding.devdojo.javacore.jdbc;

import lombok.extern.log4j.Log4j2;
import pitercoding.devdojo.javacore.jdbc.domain.Anime;
import pitercoding.devdojo.javacore.jdbc.service.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionFactoryApplication03 {
    public static void main(String[] args) {
        Anime producer1 = Anime.builder().name("Toei Animation").build();
        Anime producer2 = Anime.builder().name("White Fox").build();
        Anime producer3 = Anime.builder().name("Studio Ghibli").build();
        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
