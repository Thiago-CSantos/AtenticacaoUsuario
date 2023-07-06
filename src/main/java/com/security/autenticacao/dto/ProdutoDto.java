package com.security.autenticacao.dto;

import com.security.autenticacao.entitie.Produto;

import java.util.UUID;

public record ProdutoDto(UUID id, String titulo, Double preco) {
    public ProdutoDto(Produto produto){
        this(produto.getId(), produto.getTitulo(),produto.getPreco());
    }
}
