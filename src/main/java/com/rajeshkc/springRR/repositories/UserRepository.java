package com.rajeshkc.springRR.repositories;

import com.rajeshkc.springRR.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
