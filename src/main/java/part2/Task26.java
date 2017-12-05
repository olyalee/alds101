package part2;

import java.util.LinkedList;

public class Task26 {

    public static boolean isPalindrome(LinkedList<String> list) {
        return isTheSame(list,0,list.size()-1);
    }

    private static boolean isTheSame(LinkedList<String> list, int start, int end) {
        if (!list.get(start).equals(list.get(end))) {
            return false;
        } else if (start < end) {
           return isTheSame(list, start + 1, end - 1);
        }
        return true;
    }
}
