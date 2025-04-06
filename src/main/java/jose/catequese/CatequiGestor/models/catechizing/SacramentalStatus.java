package jose.catequese.CatequiGestor.models.catechizing;

import jakarta.persistence.Embeddable;
import jose.catequese.CatequiGestor.enums.catechizing.BaptismStatus;
import jose.catequese.CatequiGestor.enums.catechizing.EucharisticCelebrationsFrequency;
import jose.catequese.CatequiGestor.enums.catechizing.FirstEucharistStatus;
import jose.catequese.CatequiGestor.enums.catechizing.ImpedimentMarrigeStatus;
import jose.catequese.CatequiGestor.enums.catechizing.MarriedStatus;
import lombok.*;

@Getter
@Setter
@Embeddable
public class SacramentalStatus {
    private BaptismStatus baptismStatus;
    private String wichParish;
    private FirstEucharistStatus firstEucharistStatus;
    private MarriedStatus marriedStatus;
    private ImpedimentMarrigeStatus impedimentMarrigeStatus;
    private String whatImpediment;
    private EucharisticCelebrationsFrequency eucharisticCelebrationsFrequency;
}