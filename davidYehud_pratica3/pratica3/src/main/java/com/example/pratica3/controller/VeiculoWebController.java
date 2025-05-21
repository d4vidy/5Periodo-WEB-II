package com.example.pratica3.controller;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.pratica3.model.Veiculo;
import com.example.pratica3.service.VeiculoService;

import org.springframework.http.HttpStatus;

@Controller
@RequestMapping("/veiculo")
public class VeiculoWebController {

    private final VeiculoService veiculoService;

    public VeiculoWebController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    // Mapeia GET /veiculos → redireciona para /veiculos/listar
    @GetMapping
    public String index() {
        return "redirect:/veiculo/listar";
    }

    // 1. Página de cadastro
    @GetMapping("/cadastrar")
    public String exibirFormCadastro(Model model) {
        model.addAttribute("veiculo", new Veiculo());
        return "veiculo/form";
    }

    @PostMapping("/cadastrar")
    public String cadastrarveiculo(
            @Valid @ModelAttribute("veiculo") Veiculo veiculo,
            BindingResult result,
            RedirectAttributes ra) {

        if (result.hasErrors()) {
            // repopula o objeto no formulário em caso de erro
            return "veiculo/form";
        }
        veiculoService.salvarVeiculo(veiculo);
        ra.addFlashAttribute("success", "Veiculo cadastrada com sucesso!");
        return "redirect:/veiculo/listar";
    }

    // 2. Página de listagem
    @GetMapping("/listar")
    public String listarVeiculos(Model model) {
        model.addAttribute("lista", veiculoService.listarVeiculos());
        return "veiculo/lista";
    }

    // 3. Detalhes e exclusão
    @GetMapping("/{id}")
    public String detalhesVeiculos(@PathVariable Long id, Model model) {
        Veiculo p = veiculoService.buscarPorId(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Veiculo não encontrada, id: " + id
            ));
        model.addAttribute("veiculo", p);
        return "veiculo/detalhe";
    }

    @PostMapping("/{id}/excluir")
    public String excluirVeiculo(@PathVariable Long id, RedirectAttributes ra) {
        veiculoService.deletarVeiculo(id);
        ra.addFlashAttribute("success", "Veiculo excluída com sucesso!");
        return "redirect:/veiculo/listar";
    }
}
