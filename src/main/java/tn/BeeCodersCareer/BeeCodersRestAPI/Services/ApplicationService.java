package tn.BeeCodersCareer.BeeCodersRestAPI.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.Application;
import tn.BeeCodersCareer.BeeCodersRestAPI.Repositories.ApplicationRepository;

@Service
public class ApplicationService {
    @Autowired
    ApplicationRepository appRep;

    public Application addApp (Application app){return appRep.save(app);}
}
