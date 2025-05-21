package com.example.pratica3.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {

    public String obterMensagem() {
        return "Mensagem do repositório";
    }    
}
