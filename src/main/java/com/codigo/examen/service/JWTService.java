package com.codigo.examen.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface JWTService {
    String generateToken(UserDetails userDetails);
    boolean validateToken(String token, UserDetails userDetails);
    String extractUserName(String token);

    interface UsuarioService {
        UserDetailsService userDetailsService();
    }
}
