package br.com.nca.algoritmos;

public class ListaEncadeada {

    private int SIZE;
    private int position;
    private Node head;
    private Node tail;

    public ListaEncadeada() {
        this.SIZE = 0;
        this.position = 0;
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
        Node node = new Node(value, position++);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
        increase();
    }

    public void addToBack(int value) throws NumberFormatException {
        verifyValue(value);
        Node node = new Node(value, position++);
        tail.setNext(node);
        tail = node;
    }

    public Node pop() {
        Node current = head;
        Node next = current.getNext();

        while (next != tail) {
            current = next;
            next = current.getNext();
        }
        Node node = tail;
        tail = current;
        decrease();
        return node;
    }
    
    public Node elementAt(int position) {
        Node current = head;
        Node next = current.getNext();

        while (next != null) {
            if (current.getPosition() == position) {
                break;
            }
            current = next;
            next = current.getNext();
        }
        return current;
    }

    public void printList() {
        Node current = head;
        System.out.print("HEAD ");

        while (current != tail) {
            System.out.print(current.getValue());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("TAIL " + tail.getValue());
    }
}
