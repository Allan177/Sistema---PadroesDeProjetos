package com.sistema.padroes.sistema.padroes.de.projeto.repository;

import com.sistema.padroes.sistema.padroes.de.projeto.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
