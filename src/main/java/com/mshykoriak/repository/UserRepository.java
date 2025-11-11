package com.mshykoriak.repository;

import com.mshykoriak.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This is a simple repository for CRUD operations over user entity.
 *
 * @author Misha Shykoriak
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
