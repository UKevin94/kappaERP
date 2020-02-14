package formation.kappaerp.controllers;

import formation.kappaerp.entities.User;
import formation.kappaerp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/listUsers")
    public String listUsers(Model model){
        List<User> users = userService.getUsers();
        model.addAttribute("users",users);
        return "list-users";
    }

    @GetMapping("/newUser")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/user/listUsers";
    }

    @GetMapping("/viewUser")
    public String viewUser(@RequestParam("userId") int userId, Model model){

    }

    //@GetMapping("/deleteUser")
    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam("userId") int userId, Model model){

    }
}
