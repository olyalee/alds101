package part2;

import java.util.LinkedList;

/**
 * 1.5 hours
 */
public class Task24 {

    public static LinkedList<Integer> splitList(LinkedList<Integer> list, Integer pivot) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < pivot) {
                result.addFirst(list.get(i));
            } else {
                result.addLast(list.get(i));
            }
        }
        return result;
    }
}
