package com.Java.TrabalhoFinal.repository;

import com.Java.TrabalhoFinal.model.passageiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassageiroRepository extends JpaRepository<passageiro, Long> {

    List<passageiro> findByNomeContaining(String nome);
}
