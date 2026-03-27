package pitercoding.devdojo.javacore.jdbc.service;

import pitercoding.devdojo.javacore.jdbc.domain.Anime;
import pitercoding.devdojo.javacore.jdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void save(Anime producer) {
        ProducerRepository.save(producer);
    }

    public static void saveTransaction(List<Anime> producers) {
        ProducerRepository.saveTransaction(producers);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Anime producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static void updatePreparedStatement(Anime producer) {
        requireValidId(producer.getId());
        ProducerRepository.updatePreparedStatement(producer);
    }

    public static List<Anime> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Anime> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    public static List<Anime> findByNamePreparedStatement(String name) {
        return ProducerRepository.findByNamePreparedStatement(name);
    }

    public static void showProducerMetaData() {
        ProducerRepository.showProducerMetaData();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }


    public static List<Anime> findByNameAndUpdateToUpperCase(String name) {
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Anime> findByNameAndInsertWhenNotFound(String name) {
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static void findByNameAndDelete(String name) {
        ProducerRepository.findByNameAndDelete(name);
    }

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for ID.");
        }
    }
}
