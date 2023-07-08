package com.security.autenticacao.controller;

import com.security.autenticacao.dto.ProdutoDto;
import com.security.autenticacao.entitie.Produto;
import com.security.autenticacao.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/produto-post")
    public void saveAll(@RequestBody ProdutoDto produtoDto){

        Produto produto = new Produto(produtoDto);

        produtoRepository.save(produto);

    }

    @GetMapping("/produto-getAll")
    public List<ProdutoDto> getAll(){

        return produtoRepository.findAll().stream().map(ProdutoDto::new).toList();
    }

}
