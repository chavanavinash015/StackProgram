package com.bridgelabz.StackOperation;

public class LinkedList <T> {
    public Node<T> head;
    public Node<T> tail;
    public void add(T data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void push(T data) {
        Node<T> newMyNode = new Node(data);
        if (head == null) {
            head = newMyNode;
            tail = newMyNode;
        } else {
            tail.setNext(newMyNode);
            tail = newMyNode;
        }
    }

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public T pop() {
        if (head == null)
            return null;
        else {
            T data = head.getKey();
            head = (Node<T>) head.getNext();
            return data;
        }
    }

    public T popLast() {
        if (head == null)
            return null;
        else {
            Node<T> temp = head;
            while (temp.getNext() != tail) {
                temp = (Node<T>) temp.getNext();
            }
            T data = tail.getKey();
            temp.setNext(null);
            tail = temp;
            return data;
        }
    }
    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.getKey().equals(searchData))
                return temp;
            temp = (Node<T>) temp.getNext();
        }
        return null;
    }
    public boolean searchAndInsert(T searchData, T insertData) {
        Node<T> newMyNode = new Node(insertData);
        Node<T> searchedMyNode = search(searchData);
        if (searchedMyNode == null)
            return false;
        else {
            newMyNode.setNext(searchedMyNode.getNext());
            searchedMyNode.setNext(newMyNode);
            return true;
        }

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public void show(){
        if (head == null){
            System.out.println("Linked List is Empty");
        }else {
            Node<T> currNode = head;
            while (currNode != null){
                System.out.print(currNode.getKey()+" ");
                currNode = currNode.getNext();
            }
            System.out.println();
        }

    }
}