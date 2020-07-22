package com.ambiyo.springbootreddit.repository;

import com.ambiyo.springbootreddit.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository <User,Long> {
  Optional<User> findByUsername(String  username);;
}
