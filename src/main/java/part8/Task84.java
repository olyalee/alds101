package part8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * less than 1.5 hour
 */
public class Task84 {

    public static List<HashSet<String>> getAllSubsets(HashSet<String> set) {
        List<HashSet<String>> allSubsets = new ArrayList<>();

        LinkedList<String> elements = new LinkedList<>(set);

        getSubsets(elements, allSubsets);

        return allSubsets;
    }

    private static void getSubsets(LinkedList<String> elements, List<HashSet<String>> allSubsets) {
        if (!elements.isEmpty() & !allSubsets.contains(new HashSet<>(elements))) {
            allSubsets.add(new HashSet<>(elements));

            LinkedList<String> toTheRight = new LinkedList<>(elements);
            String firstElement = toTheRight.removeFirst();
            getSubsets(toTheRight, allSubsets);

            if (elements.size() > 1) {
                LinkedList<String> toTheLeft = new LinkedList<>(elements);
                toTheLeft.removeLast();
                getSubsets(toTheLeft, allSubsets);
            }

            HashSet<String> firstAndLast = new HashSet<>();
            firstAndLast.add(firstElement);
            firstAndLast.add(elements.peekLast());
            if(!allSubsets.contains(firstAndLast)){
                allSubsets.add(firstAndLast);
            }
        }
    }

}
