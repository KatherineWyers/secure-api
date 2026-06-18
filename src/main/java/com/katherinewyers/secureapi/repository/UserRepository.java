package com.katherinewyers.secureapi.repository;

import com.katherinewyers.secureapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username); // JpaRepository will generate this as an SQL automatically
}
