package com.ohgiraffers.springsecurity.auth.service;

import com.ohgiraffers.springsecurity.command.entity.User;
import com.ohgiraffers.springsecurity.command.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("유저 찾지 못함"));
        return new org.springframework.security.core.userdetails.User(
             user.getUsername(),
             user.getPassword(),
             Collections.singleton(new SimpleGrantedAuthority(user.getRole().name()))
        );
    }
}
