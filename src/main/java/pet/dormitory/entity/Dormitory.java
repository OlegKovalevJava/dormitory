package pet.dormitory.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "dormitory")
public class Dormitory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dormitoryNumber")
    private int dormitoryNumber;

    @Column(name = "roomNumber")
    private int roomNumber;

    @Column(name = "quantityRooms")
    private int quantityRooms;

    @Column(name = "nameUniversity")
    private String nameUniversity;

    @Column(name = "availableForOccupancy")
    private boolean availableForOccupancy;
}
