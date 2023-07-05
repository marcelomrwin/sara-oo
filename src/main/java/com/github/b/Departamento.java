/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.b;

import com.github.y.Vendedor;
import java.util.List;

/**
 *
 * @author marcelosales
 */
public class Departamento {
    private String nome;
    private List<Vendedor> vendedores;
    private List<String> produtos;
    private Double metaDepartamento;

    public Double getMetaDepartamento() {
        return metaDepartamento;
    }

    public void setMetaDepartamento(Double metaDepartamento) {
        this.metaDepartamento = metaDepartamento;
    }
    
    public void calcularVendas(){}
    public void distribuirMetas(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }
}
