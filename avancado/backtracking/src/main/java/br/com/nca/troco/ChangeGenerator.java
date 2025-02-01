package br.com.nca.troco;

public class ChangeGenerator {
    private int[][] solution;

    public void generateChange(double quantity, int[] coins) {
        solution = new int[coins.length][];

        for (int i = 0; i < coins.length; i++) {
            int[] coinsQuantity = new int[2];
            coinsQuantity[0] = coins[i];
            while (quantity >= coins[i]) {
                coinsQuantity[1] += 1;
                quantity -= coins[i];
            }
            solution[i] = coinsQuantity;
        }
        printSolution();
    }

    private void printSolution() {
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i][1] + " moeda(s) de: " + solution[i][0] + " R$");
        }
    }
}
