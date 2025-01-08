package br.com.nca.algoritmos.hashmap;

import br.com.nca.algoritmos.nodes.Node;

public class TabelaHash {

    public static final double FATOR_CARGA_DEFAULT = 0.75;
    public static final int CAPACIDADE_DEFAULT = 10;
    public static final double NUMERO_MULTIPLICACAO = 0.617648934;
    private int size;
    private static final Node APAGADO = new Node(-1, -1);
    private Node[] hashTable;


    public TabelaHash() {
        hashTable = new Node[CAPACIDADE_DEFAULT];
        size = 0;
    }

    private int hashKey(Integer key) {
        double hash = key * NUMERO_MULTIPLICACAO;
        hash = (hash % 1) * this.hashTable.length;
        return (int) hash;
    }

    public void put(Integer key, Node newNode) {
        if ((size / hashTable.length) >= FATOR_CARGA_DEFAULT || size == hashTable.length) {
            size = 0;
            Node[] newHashTable = new Node[hashTable.length * 2];

            for (Node node : hashTable) {
                if (node != null) {
                    put(newHashTable, node.getValue(), node);
                }
            }
            put(newHashTable, newNode.getValue(), newNode);
        } else {
            put(hashTable, key, newNode);
        }
    }

    private void put(Node[] hashTable, Integer key, Node node) {
        int sondagem = 0;
        int hashKey;

        while (sondagem < hashTable.length) {

            hashKey = (hashKey(key) + sondagem) % hashTable.length;
            Node auxNode = hashTable[hashKey];
            if (auxNode == null || auxNode.getValue() == key ||
                    auxNode.getValue() == APAGADO.getValue()) {
                hashTable[hashKey] = node;
                this.size++;
                return;
            }
            sondagem++;
        }
    }

    public Node get(Integer key) {
        int sondagem = 0;
        int hashKey;

        while (sondagem < hashTable.length) {
            hashKey = (hashKey(key) + sondagem) % hashTable.length;

            if (hashTable[hashKey] == null) {
                return null;
            }

            if (hashTable[hashKey].getValue() == key) {
                return hashTable[hashKey];
            }
            sondagem++;
        }
        return null;
    }

    public Node delete(Integer key) {
        int sondagem = 0;
        int hashKey;

        while (sondagem < hashTable.length) {
            hashKey = (hashKey(key) + sondagem) % hashTable.length;
            if (hashTable[hashKey] != null && hashTable[hashKey].getValue() == key) {
                Node auxNode = hashTable[hashKey];
                hashTable[hashKey] = APAGADO;
                size--;
                return auxNode;
            }
            sondagem--;
        }
        return null;
    }

    public void clear() {
        hashTable = new Node[CAPACIDADE_DEFAULT];
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("[ ");
        for (Node node : hashTable) {
            sb.append(node).append(" ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}
