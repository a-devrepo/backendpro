package br.com.nca;

public class Fibonacci {

    private final int MAX_ELEMENTOS = 100;
    private final int[] elementosFibonacci = new int[MAX_ELEMENTOS];


    public int encontrarElementoEm(int posicao) {
        for (int i = 0; i < MAX_ELEMENTOS; i++) {
            elementosFibonacci[i] = -1;
        }
        return buscarElemento(posicao);
    }

    private int buscarElemento(int posicao) {
        if (existeElementoEm(posicao)) {
            if (posicao <= 1) {
                elementosFibonacci[posicao] = posicao;
            } else {
                computarElemento(posicao);
            }
        }
        return elementosFibonacci[posicao];
    }

    private boolean existeElementoEm(int posicao) {
        return elementosFibonacci[posicao] == -1;
    }

    private void computarElemento(int posicao) {
        elementosFibonacci[posicao] = buscarElemento(posicao - 1) + buscarElemento(posicao - 2);
    }
}
