package pet.dormitory.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login")
    private String userLogin;

    @Column(name = "parole")
    private String parole;

    @Column(name = "role")
    private String role;

    @Column(name = "fullName")
    private String fullName;

}
