package com.vanessa.simpleecommerceapi.user.repository;

import com.vanessa.simpleecommerceapi.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
