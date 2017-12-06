package part3;

/**
 * 2 hours
 */
public class Task35 {

    public static void sortStack(Stack<Integer> origin) {
        Stack<Integer> sortedAsc = new Stack<>();
        Stack<Integer> buffer = new Stack<>();

        while (!origin.isEmpty()) {
            Integer element = origin.peek();
            if (sortedAsc.isEmpty() || element > sortedAsc.peek()) {
                sortedAsc.push(origin.pop());
            } else {
                while (!sortedAsc.isEmpty() && sortedAsc.peek() > element){
                    buffer.push(sortedAsc.pop());
                }
                sortedAsc.push(origin.pop());
                while (!buffer.isEmpty()){
                    sortedAsc.push(buffer.pop());
                }
            }
        }

        while (!sortedAsc.isEmpty()){
            origin.push(sortedAsc.pop());
        }
    }
}
