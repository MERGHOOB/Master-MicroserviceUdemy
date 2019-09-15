package com.margub.learning.jpa.jpamargubsteps.entities;
//Table - User

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;


    private String name;

    private String role;

    // default constructor is expected by JPA
    protected User() {

    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String toString() {
        return String.format("User [id =%s, name=%s, role=%s]", id, name, role);
    }


}
