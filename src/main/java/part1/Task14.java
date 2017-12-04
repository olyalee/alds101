package part1;

import java.util.*;

/**
 * Напишите функцию, которая проверяет, является ли заданная строка перестановкой палиндрома
 * "Tact Coa" -> true
 *
 * решено без подсказок
 */
public class Task14 {

    public static boolean isPalindromeTransposition(String string) {

        StringBuilder text = new StringBuilder();
        String[] words = string.split(" ");

        for (String word : words) {
            text.append(word.toLowerCase());
        }

        Map<String, Integer> mapOfSymbols = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            String letter = text.substring(i, i + 1);
            Integer value = mapOfSymbols.get(letter);
            if (value != null) {
                mapOfSymbols.put(letter, ++value);
            } else {
                mapOfSymbols.put(letter, 1);
            }
        }

        Integer oneTime = 0;

        Collection<Integer> values = mapOfSymbols.values();
        for (Integer value: values) {
            if(value == 1){
                oneTime++;
            }
            if(value>2 || oneTime > 1){
                return false;
            }
        }
        return true;
    }
}
