package com.teste.authserver.authserver.controller;

import java.security.Principal;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthController {

    @RequestMapping("/user")
    public Principal getCurrentLoggedInUser(Principal user) {
        return user;
    }

    @GetMapping("/bagulho")
    public ResponseEntity<String> dacerto(){

        return ResponseEntity.ok( "Tta ok");
    }
}