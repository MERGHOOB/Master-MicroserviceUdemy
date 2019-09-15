package com.margub.learning.jpa.jpamargubsteps;

import com.margub.learning.jpa.jpamargubsteps.entities.User;
import com.margub.learning.jpa.jpamargubsteps.services.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {


    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);

        log.info("New User created: " + user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User is retrivied " + userWithIdOne);

        List<User> all = userRepository.findAll();
        log.info("Users: "+ all);
    }
}
