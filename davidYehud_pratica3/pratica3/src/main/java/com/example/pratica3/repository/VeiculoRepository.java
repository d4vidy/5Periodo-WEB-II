// src/main/java/com/example/projeto/repository/ProdutoRepository.java
package com.example.pratica3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pratica3.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    // você pode declarar queries customizadas aqui, se precisar
}
