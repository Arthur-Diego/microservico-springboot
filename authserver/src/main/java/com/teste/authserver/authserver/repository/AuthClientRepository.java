package com.teste.authserver.authserver.repository;

import com.teste.authserver.authserver.model.AuthClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthClientRepository extends JpaRepository<AuthClientDetails, String> {
    Optional<AuthClientDetails> findByClientId(String clientId);
}
