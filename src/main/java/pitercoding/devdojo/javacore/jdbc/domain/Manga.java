package pitercoding.devdojo.javacore.jdbc.domain;

import java.util.Objects;

public record Manga(String name, int episodes) {

    public Manga {
        Objects.requireNonNull(name, "name is null");
    }
}
