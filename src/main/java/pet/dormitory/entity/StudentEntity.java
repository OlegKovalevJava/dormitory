package pet.dormitory.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "nameUniversity")
    private String nameUniversity;

    @Column(name = "nameDormitory")
    private String nameDormitory;

    @Column(name = "roomNumber")
    private int roomNumber;

    @Column(name = "yearOfEnteringUniversity")
    private int yearOfEnteringUniversity;

    @Column(name = "yearOfGraduationFromUniversity")
    private int yearOfGraduationFromUniversity;

    @Column(name = "accommodationInDormitory")
    private boolean accommodationInDormitory;

}
