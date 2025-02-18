package br.com.nca;

public class Calculadora {

    public int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int dividir(int numero1, int numero2) throws NaoPodeDividirPorZeroException {
        try {
            return numero1 / numero2;
        } catch (ArithmeticException exception) {
            throw new NaoPodeDividirPorZeroException("Não é possível dividir por zero");
        }
    }
}
