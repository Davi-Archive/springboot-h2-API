package com.app.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
