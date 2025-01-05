package br.com.nca.algoritmos.pilha;

import br.com.nca.algoritmos.exceptions.NumeroInteiroException;
import br.com.nca.algoritmos.nodes.Node;

public class Pilha {

    private Node top;
    private int size;

    public Pilha() {
        this.size = 0;
    }

    private void increase() {
        size++;
    }

    private void decrease() {
        size--;
    }

    public void push(int value) {
        verifyValue(value);
        Node node = new Node(value);
        if (top == null) {
            top = node;
        } else {
            top.setNext(node);
            node.setPrevious(top);
            top = node;
        }
        increase();
    }

    public Node top() {
        return top;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Node pop() {
        Node node = top;
        top = top.getPrevious();
        top.setNext(null);
        decrease();
        return node;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = top;
        System.out.println("TOP");

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getPrevious();
        }
    }

    private void verifyValue(int value) throws NumberFormatException {
        try {
            Integer.parseInt(String.valueOf(value));
        } catch (NumberFormatException e) {
            throw new NumeroInteiroException("O número informado não é inteiro");
        }
    }
}
