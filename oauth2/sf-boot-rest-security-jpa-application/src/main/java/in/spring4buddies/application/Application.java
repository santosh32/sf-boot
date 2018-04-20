package in.spring4buddies.application;

import in.spring4buddies.application.model.Role;
import in.spring4buddies.application.model.User;
import in.spring4buddies.application.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class Application {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
//        User user = new User(
//                "Memory",
//                "Not Found",
//                "info@memorynotfound.com",
//                passwordEncoder.encode("password"),
//                Arrays.asList(
//                        new Role("ROLE_USER"),
//                        new Role("ROLE_ADMIN")));
//
//        if (userRepository.findByEmail(user.getEmail()) == null){
//            userRepository.save(user);
//        }
        System.out.println(userRepository.findAll());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
