package br.com.nca.algoritmos;

public class ListaEncadeada {
    private int SIZE;
    private int index;
    private Node head;
    private Node tail;

    public ListaEncadeada() {
        this.SIZE = 0;
        this.index = 0;
    }

    private void increase() {
        SIZE++;
    }

    private void decrease() {
        SIZE--;
    }

    public int size() {
        return SIZE;
    }

    private void verifyValue(int value) throws NumberFormatException {
        try {
            Integer.parseInt(String.valueOf(value));
        } catch (NumberFormatException e) {
            throw new NumeroInteiroException("O número informado não é inteiro");
        }
    }

    public void addToFront(int value) throws NumberFormatException {
        verifyValue(value);
        Node node = new Node(value, index++);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
        increase();
    }

    public void printList() {
        Node current = head;
        System.out.print("HEAD ");

        while (current != tail) {
            System.out.print(current.getValue());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("TAIL " + tail.getValue());
    }
}
