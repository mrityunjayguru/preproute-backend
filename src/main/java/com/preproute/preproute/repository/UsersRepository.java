package com.preproute.preproute.repository;

import com.preproute.preproute.model.Users;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    boolean existsByUsername(String username);
    Optional<Users> findByUsername(String username);

}
