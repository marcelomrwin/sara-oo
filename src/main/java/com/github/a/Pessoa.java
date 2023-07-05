package com.github.a;

import java.time.LocalDateTime;

public class Pessoa {

    String rg;
    private String nome;
    protected LocalDateTime nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }

    public void calcIdade() {
        System.out.println("Calculando idade em Pessoa");
        
    }
    
    

}
