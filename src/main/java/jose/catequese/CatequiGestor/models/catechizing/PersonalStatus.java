package jose.catequese.CatequiGestor.models.catechizing;

import jakarta.persistence.Embeddable;
import jose.catequese.CatequiGestor.enums.catechizing.ParticipatesInChurchMovement;
import jose.catequese.CatequiGestor.enums.catechizing.SpecialNeedsStatus;
import lombok.*;

@Getter
@Setter
@Embeddable
public class PersonalStatus {
    private ParticipatesInChurchMovement participatesInChurchMovement;
    private SpecialNeedsStatus specialNeedsStatus;
    private String wichSpecialNeeds;
}
