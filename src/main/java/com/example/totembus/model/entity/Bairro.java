package com.example.totembus.model.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column
    @ElementCollection(targetClass=String.class)
    private Set<String> ruas = new LinkedHashSet<>();
    @Column
    @ElementCollection(targetClass=String.class)
    private Set<String> pontoReferencia = new LinkedHashSet<>();

    public Bairro() {
    }

    public Bairro(Long id, String nome, Set<String> ruas, Set<String> pontoReferencia) {
        this.id = id;
        this.nome = nome;
        this.ruas = ruas;
        this.pontoReferencia = pontoReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<String> getRuas() {
        return ruas;
    }

    public void setRuas(Set<String> ruas) {
        this.ruas = ruas;
    }

    public Set<String> getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(Set<String> pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bairro)) return false;
        Bairro bairro = (Bairro) o;
        return getId().equals(bairro.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Bairro{" +
                "nome='" + nome + '\'' +
                ", ruas=" + ruas +
                ", pontoReferencia=" + pontoReferencia +
                '}';
    }
}
