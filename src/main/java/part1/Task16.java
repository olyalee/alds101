package part1;

/**
 * Реализуйте метод для выполнения простейшего сжатия строк с использованием счётчика повторяющихся символов.
 * Например, строка aabcccccaaa превращается в a2b1c5a3.
 * Если сжатая строка не становится короче исходной, то метод возвращает исходную строку.
 * Предполагается, что строка состоит только из букв верхнего и нижнего регистра (a-z)
 *
 * Меньше часа
 */
public class Task16 {

    public static String compressString(String word){

        if(word.equals("")){
            return word;
        }

        StringBuilder result = new StringBuilder();
        char[] letters = word.toCharArray();

        char letter = letters[0];
        int count = 1;

        for (int i = 1; i < letters.length; i++) {
            if(letter == letters[i]){
                count++;
            }else {
                result.append(letter).append(count);
                letter = letters[i];
                count = 1;
            }
        }

        result.append(letter).append(count);

        return result.length()<word.length() ? result.toString() : word;
    }
}
