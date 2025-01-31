package br.com.nca;

import java.util.*;

public class SubSet {

    Map<String, List<Integer>> subsets = new HashMap<>();
    List<Integer> permutations = new ArrayList<>();
    Map<Integer, Integer> used = new HashMap<>();

    public void permuteBacktracking(List<Integer> numbers, int elements) {
        if (permutations.size() == elements) {
            List<Integer> permutation = new ArrayList<>(permutations);
            StringBuilder key = new StringBuilder(permutation.toString().replaceAll("\\W", ""));
            if (!subsets.containsKey(key.toString()) && !subsets.containsKey(key.reverse().toString())) {
                subsets.put(key.toString(), permutation);
            }
            return;
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (used.get(i) == null) {
                used.put(i, numbers.get(i));
                permutations.add(numbers.get(i));
                permuteBacktracking(numbers, elements);
                used.remove(i);
                permutations.remove(permutations.size() - 1);
            }
        }

    }

    public void print() {
        subsets.values().forEach(System.out::println);
    }
}
