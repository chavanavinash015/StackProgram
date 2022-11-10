package com.bridgelabz.StackOperation;

public class Stack <T> {
    private static LinkedList LinkedList;

    public Stack() {
        LinkedList = new LinkedList<>();
    }
    public void push(Node<T> element) {
        LinkedList.add((T) element);
    }
    public  Node<T> peak(){
        return LinkedList.head;
    }
    public Node<T> pop(){
        return (Node<T>) LinkedList.pop();
    }
    public void printStack(){
        LinkedList.show();
    }
}