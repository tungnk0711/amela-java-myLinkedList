package com.codegym;

public class MyLinkedList<E> {
    Node<E> head = null;
    Node<E> tail = null;
    private int size = 0;

    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;

        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;

        }
        size++;
    }

    public void addIndex(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node temp = current.next;

            Node newNode = new Node(e);
            current.next = newNode;
            (current.next).next = temp;
            size++;


        }
    }

}
