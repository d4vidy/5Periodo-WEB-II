package com.example.pratica3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pratica3.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    
}