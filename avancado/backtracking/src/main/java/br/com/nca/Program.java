package br.com.nca;

public class Program {
    public static void main(String[] args) {
        SubSet subSet = new SubSet();

        int[] numbers = {1,2,3};

        subSet.permuteBacktracking(numbers, 2);
        subSet.print();
    }
}
