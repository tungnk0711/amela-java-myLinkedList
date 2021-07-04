package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst("a");
        myLinkedList.addFirst("b");
        myLinkedList.addFirst("c");
        myLinkedList.addFirst("d");

        myLinkedList.addLast("o");
        myLinkedList.addLast("l");

        myLinkedList.addIndex(2,"v");
    }
}
