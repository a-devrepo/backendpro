package br.com.nca.algoritmos;

public class Test {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addToFront(1);
        lista.addToFront(2);
        lista.addToFront(3);
        lista.addToFront(4);
        lista.addToFront(5);

        lista.printList();
    }
}
