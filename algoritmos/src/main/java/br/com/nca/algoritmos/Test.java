package br.com.nca.algoritmos;

public class Test {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addToFront(1);
        lista.addToFront(2);
        lista.addToFront(3);
        lista.addToFront(4);
        lista.addToFront(5);

        lista.addToBack(10);
        lista.printList();

        lista.pop();
        lista.printList();

        System.out.println("Elemento na posição: "+ lista.elementAt(0).getValue());
    }
}
