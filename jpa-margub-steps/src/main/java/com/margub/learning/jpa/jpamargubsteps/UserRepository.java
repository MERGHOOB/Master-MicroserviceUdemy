package com.margub.learning.jpa.jpamargubsteps;

import com.margub.learning.jpa.jpamargubsteps.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
