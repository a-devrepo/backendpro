package br.com.nca.algoritmos.fila;

import br.com.nca.algoritmos.nodes.Node;

public class Fila {
    private Node front;
    private Node back;
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

    public void print() {
        Node current = front;
        System.out.print("FRONT ");

        while (current != null) {
            System.out.print(current);
            current = current.getNext();
        }
        System.out.println(" BACK");
    }
}
