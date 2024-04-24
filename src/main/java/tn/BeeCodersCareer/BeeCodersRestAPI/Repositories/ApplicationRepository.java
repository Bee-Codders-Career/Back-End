package tn.BeeCodersCareer.BeeCodersRestAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
