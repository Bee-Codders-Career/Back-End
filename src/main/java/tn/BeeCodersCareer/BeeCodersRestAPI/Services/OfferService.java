package tn.BeeCodersCareer.BeeCodersRestAPI.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.Offer;
import tn.BeeCodersCareer.BeeCodersRestAPI.Repositories.OfferRepository;

@Service
public class OfferService {

    @Autowired
    OfferRepository offerRep;

    public Offer addOffer (Offer offer)
    {
        return offerRep.save(offer);
    }

}
