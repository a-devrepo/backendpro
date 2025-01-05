package br.com.nca.algoritmos.nodes;

public class Node {
    private int value;
    private Node next;
    private int position;

    public Node(int value, int index) {
        this.value = value;
        this.position = index;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
