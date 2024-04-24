package tn.BeeCodersCareer.BeeCodersRestAPI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.Offer;
import tn.BeeCodersCareer.BeeCodersRestAPI.Services.OfferService;

@RestController
@RequestMapping("/api/offers")
public class OfferController {

    @Autowired
    OfferService offerServ;

    @PostMapping(value = "/add")
    public Offer addOffer (@RequestBody Offer offer){return offerServ.addOffer(offer);}
}
