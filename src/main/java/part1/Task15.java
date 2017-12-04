package part1;

/**
 * Существуют три вида модифицирующих операций со строками: вставка символа, удаление символа и замена символа.
 * Напишите фнукцию, которая проверяет, находятся ли две строки на расстоянии одной модификации (или нуля модификаций)
 *
 * 2 часа
 */
public class Task15 {

    public static boolean isOneOrLessModificationNecessary(String one, String two) {
        char[] firstWord = one.toCharArray();
        char[] secondWord = two.toCharArray();

        int firstLength = firstWord.length;
        int secondLength = secondWord.length;
        int modificationsCount = 0;

        if (firstLength == secondLength) {
            for (int i = 0; i < firstLength; i++) {
                if (firstWord[i] != secondWord[i]) {
                    modificationsCount++;
                }
            }
        } else if (Math.abs(firstLength - secondLength) == 1) {
            boolean isFirstShorter = firstLength < secondLength ? true : false;
            if (isFirstShorter) {
                for (int i = 0; i < firstLength; i++) {
                    if (firstWord[i] != secondWord[i]) {
                        if (firstWord[i] == secondWord[i + 1]) {
                            modificationsCount++;
                            i++;
                        } else {
                            return false;
                        }
                    }
                }
            } else {
                for (int i = 0; i < secondLength; i++) {
                    if (firstWord[i] != secondWord[i]) {
                        if (firstWord[i + 1] == secondWord[i]) {
                            modificationsCount++;
                            i++;
                        } else {
                            return false;
                        }
                    }
                }
            }

        } else {
            return false;
        }

        return modificationsCount > 1 ? false : true;
    }
}
