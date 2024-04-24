package tn.BeeCodersCareer.BeeCodersRestAPI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.BeeCodersCareer.BeeCodersRestAPI.Entities.User;
import tn.BeeCodersCareer.BeeCodersRestAPI.Repositories.UserRepository;
import tn.BeeCodersCareer.BeeCodersRestAPI.Services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userServ;

    @PostMapping(value = "/add")
    public User addUser(@RequestBody User user)
    {
        return userServ.adduser(user);
    }

    @PostMapping(value = "/addcandidate")
    public User addCandidate(@RequestBody User user) {return userServ.addcandidate(user);}

    @PostMapping(value = "/addmanager")
    public User addManager(@RequestBody User user) {return userServ.addmanager(user);}



}
