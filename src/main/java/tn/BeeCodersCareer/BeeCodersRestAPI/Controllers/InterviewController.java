package tn.BeeCodersCareer.BeeCodersRestAPI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.Interview;
import tn.BeeCodersCareer.BeeCodersRestAPI.Services.InterviewService;

@RestController
@RequestMapping("/api/interviews")
public class InterviewController {

    @Autowired
    InterviewService interviewServ;

    @PostMapping(value = "/add")
    public Interview addInterview (@RequestBody Interview interview){return interviewServ.addInterview(interview);}
}
