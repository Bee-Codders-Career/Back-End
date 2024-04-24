package tn.BeeCodersCareer.BeeCodersRestAPI.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import tn.BeeCodersCareer.BeeCodersRestAPI.Enumerations.InterviewState;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInterview;

    @NonNull
    @EqualsAndHashCode.Include
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime interviewDate;

    private String comments;

    @NonNull
    @Enumerated(EnumType.STRING)
    private InterviewState interviewState;

}
