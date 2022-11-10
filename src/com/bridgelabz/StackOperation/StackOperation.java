package com.bridgelabz.StackOperation;

public class StackOperation <T> {
    public static void main(String[] args) {
        System.out.println("Welcome to stack operation ");
        System.out.println("\nCreating a stack Cointaining 56->30->70");

        Stack<Integer> stack = new Stack<>();
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        Node<Integer> newNode = stack.peak();
        stack.printStack();
         Object Assert = new Object();
        Assert.equals(thirdNode == newNode);


    }
}
