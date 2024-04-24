package tn.BeeCodersCareer.BeeCodersRestAPI.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import tn.BeeCodersCareer.BeeCodersRestAPI.Enumerations.StatusApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApplication;

    @NonNull
    @Enumerated (EnumType.STRING)
    private StatusApplication statusApp;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @CreationTimestamp
    private LocalDate createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd:hh")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
