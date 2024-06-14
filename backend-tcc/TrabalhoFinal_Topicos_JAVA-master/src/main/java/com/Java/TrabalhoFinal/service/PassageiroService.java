package com.Java.TrabalhoFinal.service;

import com.Java.TrabalhoFinal.model.passageiro;
import com.Java.TrabalhoFinal.repository.PassageiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassageiroService {

    private final PassageiroRepository passageiroRepository;

    @Autowired
    public PassageiroService(PassageiroRepository passageiroRepository) {
        this.passageiroRepository = passageiroRepository;
    }

    public List<passageiro> findAll() {
        return passageiroRepository.findAll();
    }

    public Optional<passageiro> findById(Long id) {
        return passageiroRepository.findById(id);
    }

    public passageiro save(passageiro passageiro) {
        return passageiroRepository.save(passageiro);
    }

    public void deleteById(Long id) {
        passageiroRepository.deleteById(id);
    }

    public List<passageiro> findByNomeContaining(String nome) {
        return passageiroRepository.findByNomeContaining(nome);
    }
}
