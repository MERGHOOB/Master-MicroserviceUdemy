package com.margub.learning.jpa.jpamargubsteps.services;

import com.margub.learning.jpa.jpamargubsteps.entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository // interacts with DB
@Transactional
public class UserDAOService {

    //save user and retrive user to or from DB



    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        //Open transaction  //done by @Transactional
        entityManager.persist(user);
        //Close transaction
        return user.getId();
    }
   /*
    User jack = new User("jack", "Admin");

    User jill = new User("jill", "Admin");
    entityManger .persist(jack);
    //Persistence Context
     */
}
