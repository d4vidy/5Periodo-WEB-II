// src/main/java/com/example/projeto/model/Veiculos.java
package com.example.pratica3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;

@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private Integer ano;
    private BigDecimal valor;

    public Veiculo() {}

    public Veiculo(String modelo, Integer ano, BigDecimal valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
