package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}