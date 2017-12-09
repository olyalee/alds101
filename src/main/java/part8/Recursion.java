package part8;

public class Recursion {

    public static int getFactorial(int number) {
        if (number == 1) {
            return number;
        } else {
            number = number * getFactorial(number - 1);
        }
        return number;
    }

    public static int getFibonacci(int i){
        if(i == 0){
            return 0;
        }
        if(i == 1){
            return 1;
        }

        return getFibonacci(i-1)+getFibonacci(i-2);
    }

    public static int getFibonacciMemo(int i, int [] memo){
        if(i == 0 || i == 1) return i;

        if(memo[i] == 0){
            memo[i] = getFibonacciMemo(i-1, memo) + getFibonacciMemo(i-2, memo);
        }
        return memo[i];
    }
}
