package com.examplefinal2.demofinal2.repository;

import com.examplefinal2.demofinal2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
