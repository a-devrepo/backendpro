package br.com.nca.algoritmos.fila;

public class Test {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enqueue(32);
        fila.enqueue(42);
        fila.enqueue(87);
        fila.enqueue(17);
        fila.enqueue(62);

        fila.print();

        fila.dequeue();

        fila.print();

        fila.enqueue(37);

        fila.print();

        System.out.println("SIZE: " + fila.size());
        System.out.println("BACK: " + fila.rear());
        System.out.println("FRONT: " + fila.front());
        System.out.println("Is Empty: " + fila.isEmpty());
    }
}
