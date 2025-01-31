package br.com.nca;

import java.util.*;

public class SubSet {

    private List<List<Integer>> subsets = new ArrayList<>();
    private List<Integer> permutations = new ArrayList<>();

    public void permuteBacktracking(int[] numbers, int elements) {
        permuteBacktracking(numbers, elements, 0);

    }

    public void permuteBacktracking(int[] numbers, int elements, int begining) {
        if (permutations.size() == elements) {
            subsets.add(new ArrayList<>(permutations));
            return;
        }
        for (int i = begining; i < numbers.length; i++) {
            permutations.add(numbers[i]);
            permuteBacktracking(numbers, elements, i + 1);
            permutations.remove(permutations.size() - 1);
        }
    }

    public void print() {
        subsets.forEach(System.out::println);
    }
}
