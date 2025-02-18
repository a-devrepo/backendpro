package br.com.nca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FibonacciTest {

    public Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void test_DeveRetornarPrimeiroNumeroDaSequencia() {
        int elementoEsperado = 0;
        int elementoEncontrado = fibonacci.encontrarElementoEm(0);
        assertThat(elementoEsperado, is(elementoEncontrado));
    }

    @Test
    public void test_DeveRetornarSegundoNumeroDaSequencia() {
        int elementoEsperado = 1;
        int elementoEncontrado = fibonacci.encontrarElementoEm(1);
        assertThat(elementoEsperado, is(elementoEncontrado));
    }

}