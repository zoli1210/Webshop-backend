package webshopApp;

import webshopApp.models.User;
import webshopApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebshopApplication {

    private final UserRepository userRepository;

    @Autowired
    public WebshopApplication(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebshopApplication.class, args);
    }


}
