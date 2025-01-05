package br.com.nca.algoritmos;

public class Node {
    private int value;
    private Node next;
    private int index;

    public Node(int value, int index) {
        this.value = value;
        this.index = index;
    }

    public Node() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
