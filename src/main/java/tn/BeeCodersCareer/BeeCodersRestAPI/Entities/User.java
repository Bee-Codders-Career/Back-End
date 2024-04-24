package tn.BeeCodersCareer.BeeCodersRestAPI.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import tn.BeeCodersCareer.BeeCodersRestAPI.Enumerations.Gender;
import tn.BeeCodersCareer.BeeCodersRestAPI.Enumerations.Role;

import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter  //generate all getters
@Setter  //generate all setters
@NoArgsConstructor  /// generate a constructor with no arguments
@RequiredArgsConstructor // generate a constructor with required arguments (NonNull attribute)
@EqualsAndHashCode(onlyExplicitlyIncluded = true) //to compare 2 entities with only included attributes (in this case compare with email only )
@ToString
@Entity
public class User { //user class will be mapped to user table on the relationnel database
    @Id //the attribute "iduser" will be the primary key of the user table
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 1.2.3.4.5...
    private Long idUser;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    @Email
    @EqualsAndHashCode.Include
    private String email;

    @NonNull
    private String password;

    @NonNull
    @Column(length = 8)
    private Long phone;

    @NonNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthdate;

    @NonNull
    @Enumerated(EnumType.STRING)
    private Gender gender;


    @NonNull
    @Enumerated(EnumType.STRING)
    private Role role;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @CreationTimestamp
    private LocalDate createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd:hh")
    @UpdateTimestamp
    private LocalDateTime updatedAt;






}
