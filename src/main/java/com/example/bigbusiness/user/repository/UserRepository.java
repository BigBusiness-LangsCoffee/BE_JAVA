package com.example.bigbusiness.user.repository;

import com.example.bigbusiness.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
