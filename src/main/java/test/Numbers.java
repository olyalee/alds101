package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * it's very inefficient so far - need to figure out the way to improve it
 */
public class Numbers {
    private static List<Integer> listOfNumbers;

    public static HashMap<Integer, Integer> getDelimeterWithNumbers(int[] numbers) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        listOfNumbers = new ArrayList<>();
        getSet(numbers, numbers.length);

        System.out.println("Numbers quantity " + listOfNumbers.size());

        for (int num = listOfNumbers.size() - 1; num > 0; num--) {
            for (int del = listOfNumbers.size() - 1; del > 0; del--) {
                if (num != del & listOfNumbers.get(num) % listOfNumbers.get(del) == 0) {
                    pairs.put(listOfNumbers.get(del), listOfNumbers.get(num));
                }
            }
        }
        return pairs;
    }

    static void getSet(int[] numbers, int pos) {
        if (pos < 2) {
            Integer number = getInteger(numbers);
            listOfNumbers.add(number);
        } else {
            for (int i = 0; i < pos; i++) {
                swap(numbers, i, pos - 1);
                getSet(numbers, pos - 1);
                swap(numbers, i, pos - 1);
            }
        }
    }

    private static Integer getInteger(int[] numbers) {
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            num.append(String.valueOf(numbers[i]));
        }
        return Integer.parseInt(num.toString());
    }

    static void swap(int[] numbers, int i, int pos) {
        int temp = numbers[i];
        numbers[i] = numbers[pos];
        numbers[pos] = temp;
    }
}
