package test;

/**
 * Для сета из N последовательностей нуклеотидов,
 * каждая из которых может быть представлена в виде строки вида “CUUCGCAGGA…”
 * нужно разработать алгоритм поиска самой длинной общей подстроки.
 *
 * [WIP] - the longest common substring just for two strings
 */
public class Final {

    public static String getLongestSubstring(String one, String two) {
        char[] sequence1 = one.toCharArray();
        char[] sequence2 = two.toCharArray();

        int[][] matrix = new int[sequence1.length + 1][sequence2.length + 1];

        int index1 = -1;

        int maxLength = 0;
        for (int i = 1; i <= sequence1.length; i++) {
            for (int j = 1; j <= sequence2.length; j++) {
                if (sequence1[i - 1] == sequence2[j - 1]) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    if (maxLength < matrix[i][j]) {
                        maxLength = matrix[i][j];
                        index1 = i;
                    }
                }
            }
        }

        if (index1 != -1) {
            return one.substring(index1 - maxLength, index1);
        } else return "";
    }

    public static String getSubset(String first, String second) {
        StringBuilder subset = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == second.charAt(i)) {
                subset.append(first.charAt(i));
            }
        }
        return subset.toString();
    }
}
