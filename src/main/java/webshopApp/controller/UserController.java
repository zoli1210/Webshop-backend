package webshopApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webshopApp.models.User;
import webshopApp.services.UserService;

@RestController
@CrossOrigin
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<User> saveUserController (@RequestBody User personalData){
        User user = userService.createUser(personalData);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/user/{userName}")
    public ResponseEntity<User> getUserController(@PathVariable String userName){
        User user = userService.getUser(userName);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/user/{email}")
    public ResponseEntity<User> getEmailController(@PathVariable String email){
        User user = userService.getEmail(email);
        return ResponseEntity.ok(user);
    }

}
