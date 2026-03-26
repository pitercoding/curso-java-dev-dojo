package pitercoding.devdojo.projetofinalcrud.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public final class Producer {
    Integer id;
    String name;
}
