package br.com.nca;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fatorial {

    public BigInteger recursivo(BigInteger numero) {
        if (numero.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return numero.multiply(recursivo(numero.subtract(BigInteger.ONE)));
    }

    public BigInteger topDown(BigInteger numero) {
        Map<BigInteger, BigInteger> results = new HashMap<>();
        if (results.get(numero) == null) {
            if (numero.equals(BigInteger.ONE)) {
                return numero;
            } else {
                results.put(numero, numero.multiply(topDown(numero.subtract(BigInteger.ONE))));
            }
        }

        return results.get(numero);
    }

    public BigInteger bottomUp(BigInteger numero) {
        int capacity = numero.add(BigInteger.ONE).intValue();
        BigInteger[] results = new BigInteger[capacity];

        if (numero.equals(BigInteger.ONE) || numero.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        results[0] = BigInteger.ONE;
        results[1] = BigInteger.ONE;

        for (int i = 2; i <= numero.intValue(); i++) {
            results[i] = results[i - 1].multiply(BigInteger.valueOf(i));
        }

        return results[numero.intValue()];
    }


}
