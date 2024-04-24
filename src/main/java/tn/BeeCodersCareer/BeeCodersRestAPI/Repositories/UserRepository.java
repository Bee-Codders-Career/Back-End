package tn.BeeCodersCareer.BeeCodersRestAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.User;

public interface UserRepository extends JpaRepository <User , Long> {

}
