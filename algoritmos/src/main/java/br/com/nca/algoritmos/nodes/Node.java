package br.com.nca.algoritmos.nodes;

public class Node {
    private int value;
    private Node next;
    private Node previous;
    private int position;

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node(int value, int position) {
        this.value = value;
        this.position = position;
    }

    public Node(int value) {
        this.value = value;
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

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
