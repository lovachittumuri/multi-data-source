package com.demo.multi.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.multi.user.model.User;


public interface UserJpaRepository extends JpaRepository<User, Long> {
}
