package jose.catequese.CatequiGestor.models.catechizing;

import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "catechizing")
public class Catechizing {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateOfBirth;

    @Embedded
    private Address address;

    @Embedded
    private FamilyInfo familyInfo;

    @Embedded
    private SacramentalStatus sacramentalStatus;

    @Embedded
    private PersonalStatus personalStatus;
    
}