package br.com.nca.algoritmos.hashmap;

import br.com.nca.algoritmos.nodes.Node;

public class TabelaHash {

    public static final double FATOR_CARGA_DEFAULT = 0.75;
    public static final int CAPACIDADE_DEFAULT = 10;
    private int size;
    private Node[] hashTable;

    public TabelaHash() {
        hashTable = new Node[CAPACIDADE_DEFAULT];
        size = 0;
    }

    private int hashKey(Integer key) {
        double a = 0.617648934;
        double hash = key * a;
        hash = (hash % 1) * this.hashTable.length;
        return (int) hash;
    }

    public void put(String key, Node node) {
    }

}
