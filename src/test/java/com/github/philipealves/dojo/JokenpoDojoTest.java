package com.github.philipealves.dojo;

import com.github.philipealves.dojo.jokenpo.JokenpoDojo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste para Dojo do desafio Jokenpo
 * Desafio: https://dojopuzzles.com/problems/jokenpo/
 */
public class JokenpoDojoTest {

    private JokenpoDojo jokenpo;

    @Before
    public void setUp() {
        jokenpo = new JokenpoDojo();
    }

    @Test
    public void pedra_empata_com_pedra() {
        Assert.fail();
    }

    @Test
    public void tesoura_empata_com_tesoura() {
        Assert.fail();
    }

    @Test
    public void papel_empata_com_papel() {
        Assert.fail();
    }

    @Test
    public void pedra_ganha_de_tesoura() {
        Assert.fail();
    }

    @Test
    public void tesoura_ganha_de_papel() {
        Assert.fail();
    }

    @Test
    public void papel_ganha_de_pedra() {
        Assert.fail();
    }

    @Test
    public void tesoura_perde_de_pedra() {
        Assert.fail();
    }

    @Test
    public void pedra_perde_de_papel() {
        Assert.fail();
    }

    @Test
    public void papel_perde_de_tesoura() {
        Assert.fail();
    }

}
