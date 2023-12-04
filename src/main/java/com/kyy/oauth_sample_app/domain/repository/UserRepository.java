package com.kyy.oauth_sample_app.domain.repository;

import com.kyy.oauth_sample_app.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
