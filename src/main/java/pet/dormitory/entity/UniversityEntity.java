package pet.dormitory.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "university")
public class UniversityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameUniversity")
    private String nameUniversity;

    @Column(name = "termOfStudy")
    private int termOfStudy;
}
