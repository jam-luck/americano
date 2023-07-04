package com.toyproject.americano.repository;

import com.toyproject.americano.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
