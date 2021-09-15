package com.github.philipealves.dojo;

import com.github.philipealves.dojo.jokenpo.JokenpoDojo;
import com.github.philipealves.dojo.jokenpo.enums.Resultado;
import com.github.philipealves.dojo.jokenpo.enums.TiposJogada;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste para Dojo do desafio Jokenpo Desafio:
 * https://dojopuzzles.com/problems/jokenpo/
 */
public class JokenpoDojoTest {

    private JokenpoDojo jokenpo;
   
    @Before
    public void setUp() {
        jokenpo = new JokenpoDojo();
    }

    @Test
    public void pedra_empata_com_pedra() {        
        Assert.assertEquals(Resultado.EMPATA, jokenpo.play(TiposJogada.PEDRA, TiposJogada.PEDRA));
    }

    @Test
    public void tesoura_empata_com_tesoura() {
        Assert.assertEquals(Resultado.EMPATA, jokenpo.play(TiposJogada.TESOURA, TiposJogada.TESOURA));
    }

    @Test
    public void papel_empata_com_papel() {
        Assert.assertEquals(Resultado.EMPATA, jokenpo.play(TiposJogada.PAPEL, TiposJogada.PAPEL));
    }

    @Test
    public void pedra_ganha_de_tesoura() {
        Assert.assertEquals(Resultado.GANHA, jokenpo.play(TiposJogada.PEDRA, TiposJogada.TESOURA));
    }

    @Test
    public void tesoura_ganha_de_papel() {
        Assert.assertEquals(Resultado.GANHA, jokenpo.play(TiposJogada.TESOURA, TiposJogada.PAPEL));
    }

    @Test
    public void papel_ganha_de_pedra() {
        Assert.assertEquals(Resultado.GANHA, jokenpo.play(TiposJogada.PAPEL, TiposJogada.PEDRA));
    }

    @Test
    public void tesoura_perde_de_pedra() {
        Assert.assertEquals(Resultado.PERDE, jokenpo.play(TiposJogada.TESOURA, TiposJogada.PEDRA));
    }

    @Test
    public void pedra_perde_de_papel() {
        Assert.assertEquals(Resultado.PERDE, jokenpo.play(TiposJogada.PEDRA, TiposJogada.PAPEL));
    }

    @Test
    public void papel_perde_de_tesoura() {
        Assert.assertEquals(Resultado.PERDE, jokenpo.play(TiposJogada.PAPEL, TiposJogada.TESOURA));
    }

}
