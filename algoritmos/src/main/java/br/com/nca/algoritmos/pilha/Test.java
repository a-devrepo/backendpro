package br.com.nca.algoritmos.pilha;

public class Test {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push(32);
        pilha.push(64);
        pilha.push(75);
        pilha.push(29);
        pilha.push(12);

        pilha.printList();

        System.out.println("TOP: " + pilha.top());

        System.out.println("Is empty: " + pilha.isEmpty());

        System.out.println("Size: " + pilha.size());

        pilha.pop();

        System.out.println("After pop");
        pilha.printList();
    }
}
