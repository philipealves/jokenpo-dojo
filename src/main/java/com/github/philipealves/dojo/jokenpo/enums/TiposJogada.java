package com.github.philipealves.dojo.jokenpo.enums;

public enum TiposJogada {
    PEDRA(1), PAPEL(2), TESOURA(3);

    private Integer posicao;

    private TiposJogada(Integer posicao) {
        this.posicao = posicao;
    }

    public Integer getPosicao() {
        return this.posicao;
    }
}
