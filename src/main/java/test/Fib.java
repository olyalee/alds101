package test;

public class Fib {

    public static boolean checkIfFibonacci(String input) {

        if (input.length() < 3) {
            return false;
        }

        boolean isFibonacchi = false;

        int start = 0;
        for (int i = 3; i <= input.length(); ) {
            String subStringToCheck = input.substring(start, i);
            if (checkSubstring(subStringToCheck)) {
                start = start + subStringToCheck.length() / 3;
                i = start + subStringToCheck.length();
                isFibonacchi = true;
            } else {
                i++;
                isFibonacchi = false;
            }
        }
        return isFibonacchi;
    }

    static boolean checkSubstring(String s) {
        int pivot1;
        int pivot2;
        int len = s.length();
        if (len % 3 != 2) {
            pivot1 = len / 3;
            pivot2 = pivot1 * 2;
        } else {
            pivot1 = len / 3;
            pivot2 = (len - len / 3) / 2;
        }

        int first = Integer.parseInt(s.substring(0, pivot1));
        int second = Integer.parseInt(s.substring(pivot1, pivot2));
        int sum = Integer.parseInt(s.substring(pivot2));

        return checkIfItSum(first, second, sum);
    }

    static boolean checkIfItSum(int a, int b, int s) {
        return s == (a + b);
    }
}