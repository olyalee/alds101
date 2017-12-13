package part8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task84 {


    public static List<HashSet<String>> getSubsets(String[] set) {
        List<HashSet<String>> subsets = new ArrayList<>();

        for (int mask = 0; mask < (1 << set.length); mask++) {
            HashSet<String> subset = new HashSet<>();
            for (int index = 0; index < set.length; index++) {
                if ((mask & (1 << index)) != 0) {
                    subset.add(set[index]);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }
}
