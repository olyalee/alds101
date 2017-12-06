package part2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 1 hour
 */
public class Task21 {

    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list){
        LinkedList<Integer> result = new LinkedList<>();
        Set<Integer> buffer = new HashSet<>();
        list.forEach(element -> {
            if(!buffer.contains(element)){
                buffer.add(element);
                result.add(element);
            }
        });
        return result;
    }

    public static LinkedList<Integer> removeDuplicatesWithoutBuffer(LinkedList<Integer> list){
        LinkedList<Integer> result = new LinkedList<>();
        list.forEach(element -> {
            if(!result.contains(element)){
                result.add(element);
            }
        });
        return result;
    }
}
