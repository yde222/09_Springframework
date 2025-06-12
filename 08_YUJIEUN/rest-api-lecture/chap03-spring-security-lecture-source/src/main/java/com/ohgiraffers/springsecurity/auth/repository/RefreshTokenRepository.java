package com.ohgiraffers.springsecurity.auth.repository;

import com.ohgiraffers.springsecurity.auth.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, String> {
}
