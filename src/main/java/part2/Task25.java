package part2;

import java.util.LinkedList;

public class Task25 {

    public static LinkedList<Integer> linkedListSum(LinkedList<Integer> one, LinkedList<Integer> two) {
        LinkedList<Integer> first = new LinkedList<>(one);
        LinkedList<Integer> second = new LinkedList<>(two);

        int diff = first.size() - second.size();
        if (diff > 0) {
            normalizeList(second, diff);
        } else if (diff < 0) {
            normalizeList(first, Math.abs(diff));
        }

        return sumUp(first,second);
    }

    private static LinkedList<Integer> sumUp(LinkedList<Integer> first, LinkedList<Integer> second) {
        LinkedList<Integer> result = new LinkedList<>();
        int ten = 0;
        for (int i = 0; i < first.size(); i++) {
            int sum = first.get(i) + second.get(i) + ten;
            if (sum > 9) {
                ten = 1;
                result.add(sum - 10);
            } else {
                result.add(sum);
                ten = 0;
            }
        }
        return result;
    }

    private static void normalizeList(LinkedList<Integer> list, int size) {
        int diff = size - list.size();
        for (int i = 0; i < diff; i++) {
            list.add(0);
        }
    }
}
