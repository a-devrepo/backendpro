package br.com.nca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculadoraTest {

    public Calculadora calculadora = new Calculadora();

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void test_DeveSomarDoisInteiros(){
        int valorEsperado = 100;

        int resultado = calculadora.somar(50,50);

        assertThat(resultado, is(valorEsperado));
    }

    @Test
    public void test_DeveSubtrairDoisInteiros(){
        int valorEsperado = 0;

        int resultado = calculadora.subtrair(50,50);

        assertThat(resultado, is(valorEsperado));
    }

    @Test
    public void test_DeveMultiplicarDoisInteiros(){
        int valorEsperado = 2500;

        int resultado = calculadora.multiplicar(50,50);

        assertThat(resultado, is(valorEsperado));
    }

    @Test
    public void test_DeveDividirDoisInteiros(){
        int valorEsperado = 1;

        int resultado = calculadora.dividir(50,50);

        assertThat(resultado, is(valorEsperado));
    }

}