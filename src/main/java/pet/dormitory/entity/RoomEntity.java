package pet.dormitory.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "room")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "roomNumber")
    private int roomNumber;

    @Column(name = "nameOfDormitory")
    private String nameOfDormitory;

    @Column(name = "roomCapacity")
    private int roomCapacity;

    @Column(name = "availableForOccupancy")
    private boolean availableForOccupancy;

    @Column(name = "gender")
    private String gender;
}
