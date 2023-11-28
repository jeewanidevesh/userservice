package dev.naman.userservicetestfinal;

import dev.naman.userservicetestfinal.models.User;
import dev.naman.userservicetestfinal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class UserservicetestfinalApplication {
//    implements CommandLineRunner {
//
//    private final UserRepository userRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public UserservicetestfinalApplication(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public static void main(String[] args) {
        SpringApplication.run(UserservicetestfinalApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        User user=new User();
//        user.setEmail("biswa@scaler.com");
//        user.setPassword(passwordEncoder.encode("hello"));
//        userRepository.save(user);
//    }
}
