package com.itfbgroup.ivanovii.bookLibrary.repository;

import com.itfbgroup.ivanovii.bookLibrary.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findUserByUsername(String username);
}
