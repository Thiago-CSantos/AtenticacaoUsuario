package com.security.autenticacao.entitie;

import com.security.autenticacao.dto.ProdutoDto;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(columnDefinition = "TEXT")
    private String titulo;
    private Double preco;

    public Produto(String titulo, Double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public Produto(ProdutoDto produtoDto) {
        this.titulo = produtoDto.titulo();
        this.preco = produtoDto.preco();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
