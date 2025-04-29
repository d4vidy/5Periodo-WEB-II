package com.example.projeto.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.projeto.service.MensagemService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class MensagemController{
    private final MensagemService mensagemService;

    public MensagemController(MensagemService mensagemService){
        this.mensagemService = mensagemService;
    }
    @GetMapping("/mensagem")
    public String obterMensagem(){
        return mensagemService.obterMensagem();
    }
}