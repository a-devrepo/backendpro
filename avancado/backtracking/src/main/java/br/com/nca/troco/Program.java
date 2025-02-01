package br.com.nca.troco;

public class Program {
    public static void main(String[] args) {
        ChangeGenerator changeGenerator = new ChangeGenerator();
        int[] coins = {5, 2, 1};
        int quantity = 18;
        changeGenerator.generateChange(quantity, coins);
    }
}
