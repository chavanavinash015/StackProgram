package com.bridgelabz.StackOperation;

public class LinkedListMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the linkedList programs");
        System.out.println("Create Linked List of 56, 30, 70");

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(70);
        list1.add(30);
        list1.add(56);
        list1.push(46);

        list1.show();
        Integer popElement = (Integer) list1.pop();
        if (popElement == null)
            System.out.println("Empty list");
        else
            System.out.println("Popped element => " + popElement);
        list1.show();

        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(56);
        list2.add(30);
        list2.add(70);
        list2.push(46);
        list2.show();

        Integer poppedLastElement = list2.popLast();
        if (poppedLastElement == null)
            System.out.println("Empty list");
        else
            System.out.println("Popped Last element => " + poppedLastElement);
        list2.show();

        list2.add(90);
        list2.show();

        if (list2.search(100) == null)
            System.out.println("Element Not Found!");
        else
            System.out.println("Element Found");

        boolean success = list2.searchAndInsert(30, 40);
        if (success)
            System.out.println("Searched And Inserted Element!");
        else
            System.out.println("Unsuccessfully!!");
        list2.show();
    }
}
