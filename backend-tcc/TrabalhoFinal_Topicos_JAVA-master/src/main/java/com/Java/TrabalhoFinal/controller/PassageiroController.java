package com.Java.TrabalhoFinal.controller;

import com.Java.TrabalhoFinal.model.passageiro;
import com.Java.TrabalhoFinal.service.PassageiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passageiros")
public class PassageiroController {

    private final PassageiroService passageiroService;

    @Autowired
    public PassageiroController(PassageiroService passageiroService) {
        this.passageiroService = passageiroService;
    }

    @GetMapping
    public List<passageiro> getAllPassageiros() {
        return passageiroService.findAll();
    }

    @GetMapping("/id/{id}")
    public passageiro getPassageiroById(@PathVariable Long id) {
        return passageiroService.findById(id)
                .orElseThrow(() -> new RuntimeException("Passageiro não encontrado com ID: " + id));
    }

    @PostMapping
    public passageiro createPassageiro(@RequestBody passageiro passageiro) {
        return passageiroService.save(passageiro);
    }

    @DeleteMapping("{id}")
    public void deletePassageiro(@PathVariable Long id) {
        passageiroService.deleteById(id);
    }

    @GetMapping("/passageiros")
    public List<passageiro> getPassageiroByNome(@RequestParam String nome) {
        return passageiroService.findByNomeContaining(nome);
    }
    @PutMapping("/{id}")
    public passageiro updatePassageiro(@PathVariable Long id, @RequestBody passageiro passageiroAtualizado) {
        return passageiroService.findById(id)
                .map(passageiro -> {
                    passageiro.setNome(passageiroAtualizado.getNome());
                    passageiro.setPonto(passageiroAtualizado.getPonto());
                    passageiro.setEndereco(passageiroAtualizado.getEndereco());
                    passageiro.setTelefone(passageiroAtualizado.getTelefone());
                    passageiro.setDt_nascimento(passageiroAtualizado.getDt_nascimento());
                    passageiro.setFoto(passageiroAtualizado.getFoto());
                    passageiro.setSegunda(passageiroAtualizado.isSegunda());
                    passageiro.setTerca(passageiroAtualizado.isTerca());
                    passageiro.setQuarta(passageiroAtualizado.isQuarta());
                    passageiro.setQuinta(passageiroAtualizado.isQuinta());
                    passageiro.setSexta(passageiroAtualizado.isSexta());
                    passageiro.setManha(passageiroAtualizado.isManha());
                    passageiro.setTarde(passageiroAtualizado.isTarde());
                    passageiro.setNoite(passageiroAtualizado.isNoite());

                    return passageiroService.save(passageiro);
                })
                .orElseThrow(() -> new RuntimeException("Passageiro não encontrado com ID: " + id));
    }
}
