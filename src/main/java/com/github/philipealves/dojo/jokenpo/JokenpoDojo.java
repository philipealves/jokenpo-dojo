package com.github.philipealves.dojo.jokenpo;

import com.github.philipealves.dojo.jokenpo.enums.Resultado;
import com.github.philipealves.dojo.jokenpo.enums.TiposJogada;

/**
 * Desafio Jokenpo: https://dojopuzzles.com/problems/jokenpo/
 * 
 * Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre três possíveis itens:
 * Pedra, Papel ou Tesoura.
 *
 * O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa o resultado da
 * partida.
 *
 * As regras são as seguintes:
 *
 * Pedra empata com Pedra e ganha de Tesoura Tesoura empata com Tesoura e ganha de Papel Papel
 * empata com Papel e ganha de Pedra
 */
public class JokenpoDojo {

	public Resultado play(TiposJogada jogador1, TiposJogada jogador2) {
        
		if (jogador1.getPosicao() + jogador2.getPosicao() == jogador1.getPosicao() * 2)
			return Resultado.EMPATA;

		if (jogador1 == TiposJogada.TESOURA && jogador2 == TiposJogada.PEDRA) 
			return Resultado.PERDE;

		if (jogador1 == TiposJogada.PEDRA && jogador2 == TiposJogada.PAPEL)
			return Resultado.PERDE;

		if (jogador1 == TiposJogada.PAPEL && jogador2 == TiposJogada.TESOURA)
			return Resultado.PERDE;
				
		return Resultado.GANHA;
		
	}
}
