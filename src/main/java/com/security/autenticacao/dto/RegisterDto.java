package com.security.autenticacao.dto;

import com.security.autenticacao.entitie.enums.UserRole;

public record RegisterDto(String login, String password, UserRole role) {
}

