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

    private int hashKey(String key){
        return 0;
    }

    public void put(String key, Node node) {
    
    }

}
