package jose.catequese.CatequiGestor.models.catechizing;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@Embeddable
public class Address {
    private String address;
    private String neighborhood;
}
