package tn.BeeCodersCareer.BeeCodersRestAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
