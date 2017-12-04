package part1;

/**
 * Для двух строк напишите метод, определяющий, является ли одна строка перестановкой другой
 *
 * решено с подсказками
 */
public class Task12 {

    public static boolean isTransposition(String one, String two){
        boolean result = false;

        if(one.length()!= two.length()){
            return false;
        }

        if(sortSymbols(one).equals(sortSymbols(two))) {
            result = true;
        }

        return result;
    }

    static String sortSymbols(String word){
        char[] symbols = word.toCharArray();
        java.util.Arrays.sort(symbols);
        return new String(symbols);
    }
}
