package com.margub.learning.jpa.jpamargubsteps;

import com.margub.learning.jpa.jpamargubsteps.entities.User;
import com.margub.learning.jpa.jpamargubsteps.services.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {


    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long id = userDAOService.insert(user);
        log.info("New User created: " + user);
    }
}
