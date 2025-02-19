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
        long elementoEsperado = 0;
        long elementoEncontrado = fibonacci.encontrarElementoEm(1);
        assertThat(elementoEsperado, is(elementoEncontrado));
    }

    @Test
    public void test_DeveRetornarSegundoNumeroDaSequencia() {
        long elementoEsperado = 1;
        long elementoEncontrado = fibonacci.encontrarElementoEm(2);
        assertThat(elementoEsperado, is(elementoEncontrado));
    }

    @Test
    public void test_DeveRetornarSextagesimoNumeroDaSequencia() {
        long elementoEsperado = 956722026041L;
        long elementoEncontrado = fibonacci.encontrarElementoEm(60);
        assertThat(elementoEsperado, is(elementoEncontrado));
    }
}