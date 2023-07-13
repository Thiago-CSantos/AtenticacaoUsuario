package com.security.autenticacao.controller;

import com.security.autenticacao.dto.AutenticaoDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("autenticao")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public void login(@RequestBody @Valid AutenticaoDto autenticaoDto) {
        var userNamePassword = new UsernamePasswordAuthenticationToken(autenticaoDto.login(), autenticaoDto.password());

        var auth = this.authenticationManager.authenticate(userNamePassword);
    }

    @PostMapping("/register")
    public void registrar(@RequestBody @Valid RegistrarDto RegistrarDto ){

    }
}
