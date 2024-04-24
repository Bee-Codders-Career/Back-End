package tn.BeeCodersCareer.BeeCodersRestAPI.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import tn.BeeCodersCareer.BeeCodersRestAPI.Enumerations.InterviewState;
import tn.BeeCodersCareer.BeeCodersRestAPI.Enumerations.StatusOffer;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class Offer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idOffer;
    @EqualsAndHashCode.Include
    @NonNull
    private String offerTitle;
    @NonNull
    private Long maxAge;
    @NonNull
    private String experience;
    @NonNull
    private String diploma;
    @NonNull
    private String mission;
    @NonNull
    private String skills;
    @NonNull
    private String requirement;

    @Enumerated(EnumType.STRING)
    private StatusOffer statusOffer;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @CreationTimestamp
    private LocalDate createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd:hh")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
