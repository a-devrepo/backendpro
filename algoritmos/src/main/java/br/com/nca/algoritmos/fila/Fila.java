package br.com.nca.algoritmos.fila;

import br.com.nca.algoritmos.nodes.Node;

public class Fila {
    private Node front;
    private Node back;
    private int size;

    public Fila() {
        this.size = 0;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (this.size == 0) {
            this.front = node;
            this.back = node;
        } else {
            back.setNext(node);
            back = node;
        }
        increase();
    }

    public void dequeue() {
        Node node = front;
        front = front.getNext();
        node.setNext(null);
        decrease();
    }

    public int size() {
        return size;
    }

    public Node rear() {
        return back;
    }

    public Node front() {
        return front;
    }

    public boolean isEmpty() {
        return size == 0;
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

        while (current != back) {
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("BACK "+ back);
    }
}
