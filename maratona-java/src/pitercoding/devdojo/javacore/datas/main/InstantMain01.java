package pitercoding.devdojo.javacore.datas.main;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantMain01 {
    public static void main(String[] args) {
        Instant now = Instant.now(); // nanosegundos
        System.out.println(now);
        System.out.println(LocalDateTime.now());
    }
}
