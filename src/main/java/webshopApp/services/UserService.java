package webshopApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webshopApp.models.User;
import webshopApp.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser (User personalData){
        return userRepository.save(personalData);
    }
    public User getUser(String userName){return userRepository.findByUserName(userName) ;}
    public User getEmail(String email){return userRepository.findByEmail(email);}
}

