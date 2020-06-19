package com.revature.cats.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.revature.cats.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  
  //@Query(value = "select * from User u where u.username = :username and u.password = :password", nativeQuery = true)
  //List<User> checkUsernamePassword(String username,String password );
  
  //List<User> findByUsernameAndPassword(String username, String password);
  
}
