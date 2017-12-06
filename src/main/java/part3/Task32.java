package part3;

import java.util.EmptyStackException;

/**
 * 1.5 hours
 */
public class Task32 {

}

class Stack<T extends Comparable> {

    private Node<T> top;

    public T pop() {

        if (top == null) {
            throw new EmptyStackException();
        }

        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T data) {

        T min;

        if (isEmpty()) {
            min = data;
        } else {
            min = data.compareTo(top.min) > 0 ? top.min : data;
        }

        Node<T> newNode = new Node<>(data, min);
        newNode.next = top;
        top = newNode;
    }

    public T peek() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public T min() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.min;
    }

    public boolean isEmpty() {
        return top == null;
    }

    private static class Node<T> {
        private T data;
        private T min;
        private Node<T> next;

        public Node(T data, T min){
            this.data = data;
            this.min = min;
        }
    }
}