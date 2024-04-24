package tn.BeeCodersCareer.BeeCodersRestAPI.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.User;
import tn.BeeCodersCareer.BeeCodersRestAPI.Enumerations.Role;
import tn.BeeCodersCareer.BeeCodersRestAPI.Repositories.UserRepository;

import javax.validation.constraints.Null;

@Service
public class UserService {

    @Autowired
    UserRepository userRep;

    public User adduser(User user) {
        return userRep.save(user);
    }

    public User addcandidate (User user) {
        user.setRole(Role.CANDIDATE);
        return userRep.save(user);
    }

    public User addmanager (User user) {
        user.setRole(Role.MANAGER);
        return userRep.save(user);
    }

}
