package br.com.nca.algoritmos.fila;

public class Fila {
    private int front;
    private int back;
    private int size;

    public Fila() {
        this.size = 0;
    }

    private void increase() {
        this.size++;
    }

    private void decrease() {
        this.size--;
    }
}
