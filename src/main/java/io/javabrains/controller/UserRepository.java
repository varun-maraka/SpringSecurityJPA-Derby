package io.javabrains.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String userName);
}
