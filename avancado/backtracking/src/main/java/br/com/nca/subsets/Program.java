package br.com.nca.subsets;

public class Program {
    public static void main(String[] args) {
        SubSet subSet = new SubSet();

        int[] numbers = {1,2,3};

        subSet.permuteBacktracking(numbers, 2);
        subSet.print();

        int[] numbers2 = {1,2,3,4};
        subSet.permuteBacktracking(numbers2, 1);
        subSet.print();
    }
}
