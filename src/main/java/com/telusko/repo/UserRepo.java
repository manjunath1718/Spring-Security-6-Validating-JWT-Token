package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {

	Users findByUsername(String username);

}
