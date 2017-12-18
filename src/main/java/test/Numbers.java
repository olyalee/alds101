package test;

import java.util.*;


public class Numbers {
    private static Map<Integer, Set<Integer>> map;
    private static int MAX_NUM = 987654321;

    public static Map<Integer, Set<Integer>> getDividendsAndDivisors(int[] numbers) {
        map = new HashMap<>();
        addAllPossibleNumbersToMap(numbers, numbers.length);

        Integer dividend;

        for (Integer divisor : map.keySet()) {
            for (int i = 2; i <= MAX_NUM / divisor; i++) {
                dividend = divisor * i;
                if (map.containsKey(dividend)) {
                    map.putIfAbsent(dividend, new HashSet<>());
                    map.get(dividend).add(divisor);
                }
            }
        }

        map.values().removeAll(Collections.singleton(null));

        return map;
    }

    static void addAllPossibleNumbersToMap(int[] numbers, int pos) {
        if (pos < 2) {
            Integer number = getInteger(numbers);
            map.putIfAbsent(number, null);
        } else {
            for (int i = 0; i < pos; i++) {
                swap(numbers, i, pos - 1);
                addAllPossibleNumbersToMap(numbers, pos - 1);
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
