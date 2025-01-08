package br.com.nca.algoritmos.hashmap;

import br.com.nca.algoritmos.nodes.Node;

public class Test {
    public static void main(String[] args) {
        Node node1 = new Node(9809);
        Node node2 = new Node(435);
        Node node3 = new Node(3095);
        Node node4 = new Node(8042);
        Node node5 = new Node(3741);
        Node node6 = new Node(4174);
        Node node7 = new Node(8263);


        TabelaHash tabelaHash = new TabelaHash();

        tabelaHash.put(node1.getValue(), node1);
        tabelaHash.put(node2.getValue(), node2);
        tabelaHash.put(node3.getValue(), node3);
        tabelaHash.put(node4.getValue(), node4);
        tabelaHash.put(node5.getValue(), node5);
        tabelaHash.put(node6.getValue(), node6);
        tabelaHash.put(node7.getValue(), node7);

        tabelaHash.print();

    }
}
