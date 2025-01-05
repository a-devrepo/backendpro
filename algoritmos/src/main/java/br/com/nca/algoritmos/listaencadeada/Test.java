package br.com.nca.algoritmos.listaencadeada;

public class Test {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addToFront(1);
        lista.addToFront(2);
        lista.addToFront(3);
        lista.addToFront(4);
        lista.addToFront(5);

        lista.push(10);
        lista.printList();

        lista.pop();
        lista.printList();

        System.out.println("Elemento na posição " + 0 + ": " + lista.elementAt(0).getValue());
        lista.remove(2);
        lista.printList();

        lista.insert(81,1);
        lista.printList();
    }
}
