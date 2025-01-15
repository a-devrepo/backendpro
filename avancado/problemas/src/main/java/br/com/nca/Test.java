package br.com.nca;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();

        System.out.println("Recursivo: "+fatorial.recursivo(BigInteger.valueOf(500)));
        System.out.println("Top Down:"+fatorial.topDown(BigInteger.valueOf(110)));
        System.out.println("Bottom Up:"+fatorial.bottomUp(BigInteger.valueOf(110)));
    }
}
