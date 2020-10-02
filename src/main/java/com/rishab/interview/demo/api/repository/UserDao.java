package com.rishab.interview.demo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rishab.interview.demo.api.entity.User;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

	User findByUsername(String username);
}
