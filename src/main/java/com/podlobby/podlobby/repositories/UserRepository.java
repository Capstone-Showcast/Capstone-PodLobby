package com.podlobby.podlobby.repositories;

import com.podlobby.podlobby.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {




}