package com.github.a;

import java.util.List;

/**
 *
 * @author marcelosales
 */
public abstract class Cantor extends Pessoa {

    private String nomeArtistico;
    private Double cache;
    private List<String> cancoes;

    public abstract void cantar(int repeticoes);

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public Double getCache() {
        return cache;
    }

    public void setCache(Double cache) {
        this.cache = cache;
    }

    public List<String> getCancoes() {
        return cancoes;
    }

    public void setCancoes(List<String> cancoes) {
        this.cancoes = cancoes;
    }

}
