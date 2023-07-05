package com.github.y;

import com.github.a.Pessoa;

/**
 *
 * @author marcelosales
 */
public class Vendedor extends Pessoa {

    private Double vendasMes;
    private Double salario;
    private String especialidade;
    private Double meta;

    public void vender() {
    }

    public void estabelecerMeta(Double metaDepartamento, int numeroVendedores) {

        Double a = salario / 22;
        Double b = metaDepartamento / numeroVendedores;
        Double c = a * b;
        Double d = c + (c * 0.15);
        meta = d;

    }

    public Double getVendasMes() {
        return vendasMes;
    }

    public void setVendasMes(Double vendasMes) {
        this.vendasMes = vendasMes;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getMeta() {
        return meta;
    }

    public void setMeta(Double meta) {
        this.meta = meta;
    }
}
