package tn.BeeCodersCareer.BeeCodersRestAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Long> {
}
