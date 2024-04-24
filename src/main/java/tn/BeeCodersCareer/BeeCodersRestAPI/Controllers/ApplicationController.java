package tn.BeeCodersCareer.BeeCodersRestAPI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.Application;
import tn.BeeCodersCareer.BeeCodersRestAPI.Services.ApplicationService;

@RestController
@RequestMapping("/api/apps")
public class ApplicationController {
    @Autowired
    ApplicationService appServ;


    @PostMapping(value = "/add")
    public Application addApp(@RequestBody Application app){return appServ.addApp(app);}
}
