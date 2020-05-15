package com.teste.authserver.authserver.service;

import com.teste.authserver.authserver.repository.AuthClientRepository;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.stereotype.Service;

@Service
public class AuthClientDetailsService implements ClientDetailsService {
    private final AuthClientRepository authClientRepository;

    public AuthClientDetailsService(AuthClientRepository authClientRepository) {
        this.authClientRepository = authClientRepository;
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) {

        Object obj = authClientRepository.findByClientId(clientId);
        return authClientRepository.findByClientId(clientId).orElseThrow(IllegalArgumentException::new);
    }
}