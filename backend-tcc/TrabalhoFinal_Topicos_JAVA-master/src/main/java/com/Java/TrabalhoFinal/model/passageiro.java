package com.Java.TrabalhoFinal.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Passageiro")
public class passageiro implements Serializable {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "PONTO", nullable = false)
    private String ponto;

    @Column(name = "ENDERECO", nullable = false)
    private String endereco;

    @Column(name = "TELEFONE", nullable = false, unique = true)
    private String telefone;

    @Column(name = "DT_NASCIMENTO", nullable = false)
    private String dt_nascimento;

    @Column(name= "FOTO", nullable = false, columnDefinition = "LONGTEXT")
    private String  foto;


    @Column(name = "segunda", nullable = false)
    private boolean segunda = false;

    @Column(name = "terca", nullable = false)
    private boolean terca = false;

    @Column(name = "quarta", nullable = false)
    private boolean quarta = false;

    @Column(name = "quinta", nullable = false)
    private boolean quinta = false;

    @Column(name = "sexta", nullable = false)
    private boolean sexta = false;

    @Column(name = "manha", nullable = false)
    private boolean manha = false;

    @Column(name = "tarde", nullable = false)
    private boolean tarde = false;
    @Column(name = "noite", nullable = false)
    private boolean noite = false;






    public passageiro() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPonto() {
        return ponto;
    }

    public void setPonto(String ponto) {
        this.ponto = ponto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isSegunda() {
        return segunda;
    }

    public void setSegunda(boolean segunda) {
        this.segunda = segunda;
    }

    public boolean isTerca() {
        return terca;
    }

    public void setTerca(boolean terca) {
        this.terca = terca;
    }

    public boolean isQuarta() {
        return quarta;
    }

    public void setQuarta(boolean quarta) {
        this.quarta = quarta;
    }

    public boolean isQuinta() {
        return quinta;
    }

    public void setQuinta(boolean quinta) {
        this.quinta = quinta;
    }

    public boolean isSexta() {
        return sexta;
    }

    public void setSexta(boolean sexta) {
        this.sexta = sexta;
    }

    public boolean isManha() {
        return manha;
    }

    public void setManha(boolean manha) {
        this.manha = manha;
    }

    public boolean isTarde() {
        return tarde;
    }

    public void setTarde(boolean tarde) {
        this.tarde = tarde;
    }

    public boolean isNoite() {
        return noite;
    }

    public void setNoite(boolean noite) {
        this.noite = noite;
    }
}
