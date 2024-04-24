package tn.BeeCodersCareer.BeeCodersRestAPI.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.Interview;
import tn.BeeCodersCareer.BeeCodersRestAPI.Repositories.InterviewRepository;

@Service
public class InterviewService {
    @Autowired
    InterviewRepository interviewRepo;

    public Interview addInterview (Interview interview){return interviewRepo.save(interview);}
}
