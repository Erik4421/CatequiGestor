package jose.catequese.CatequiGestor.models.catechizing;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@Embeddable
public class FamilyInfo {
    private String nameFather;
    private String nameMother;
    private String phoneNumber;
}
