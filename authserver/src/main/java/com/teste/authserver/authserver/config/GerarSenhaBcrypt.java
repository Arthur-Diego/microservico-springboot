package com.teste.authserver.authserver.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GerarSenhaBcrypt {
    public static void main(String args[]){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123456"));
    }
}

