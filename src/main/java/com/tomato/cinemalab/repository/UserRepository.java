package com.tomato.cinemalab.repository;

import com.tomato.cinemalab.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserAccount,Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a user with an email?
    UserAccount findByEmail(String email);

    //Write a derived query to read a user with an username?
    UserAccount findByUsername(String userName);

    //Write a derived query to list all users that contain a specific name?

    //Write a derived query to list all users that contain a specific name in the ignore case mode?

    //Write a derived query to list all users with an age greater than a specified age?

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns a user read by email?

    //Write a JPQL query that returns a user read by username?

    //Write a JPQL query that returns all users?

    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns all users that contain a specific name?

    //Write a native query that returns all users?

    //Write a native query that returns all users in the range of ages?

    //Write a native query to read a user by email?
}
