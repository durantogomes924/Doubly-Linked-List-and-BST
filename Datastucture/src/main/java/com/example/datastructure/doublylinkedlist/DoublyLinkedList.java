package com.example.datastructure.doublylinkedlist;

public class DoublyLinkedList {

    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Check whether the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return the number of elements
    public int size() {
        return size;
    }

    // Add a new element at the beginning
    public void addFirst(int data) {

        DoublyLinkedListNode newNode =
                new DoublyLinkedListNode(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }

        size++;
    }

    // Add a new element at the end
    public void addLast(int data) {

        DoublyLinkedListNode newNode =
                new DoublyLinkedListNode(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Insert an element at a specific index
    public void insert(int index, int data) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                    "Invalid index: " + index);
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        DoublyLinkedListNode current = getNode(index);

        DoublyLinkedListNode newNode =
                new DoublyLinkedListNode(data);

        DoublyLinkedListNode previousNode = current.previous;

        newNode.previous = previousNode;
        newNode.next = current;

        previousNode.next = newNode;
        current.previous = newNode;

        size++;
    }

    // Get the node at a specific index
    private DoublyLinkedListNode getNode(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Invalid index: " + index);
        }

        // Start from the head if index is in the first half
        if (index < size / 2) {

            DoublyLinkedListNode current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current;
        }

        // Start from the tail if index is in the second half
        DoublyLinkedListNode current = tail;

        for (int i = size - 1; i > index; i--) {
            current = current.previous;
        }

        return current;
    }

    // Get the data at a specific index
    public int get(int index) {

        return getNode(index).data;
    }

    // Replace the data at a specific index
    public void set(int index, int data) {

        DoublyLinkedListNode node = getNode(index);

        node.data = data;
    }

    // Remove the first element
    public int removeFirst() {

        if (isEmpty()) {
            throw new IllegalStateException(
                    "List is empty");
        }

        int removedData = head.data;

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }

        size--;

        return removedData;
    }

    // Remove the last element
    public int removeLast() {

        if (isEmpty()) {
            throw new IllegalStateException(
                    "List is empty");
        }

        int removedData = tail.data;

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }

        size--;

        return removedData;
    }

    // Remove an element at a specific index
    public int remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Invalid index: " + index);
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == size - 1) {
            return removeLast();
        }

        DoublyLinkedListNode current = getNode(index);

        int removedData = current.data;

        DoublyLinkedListNode previousNode =
                current.previous;

        DoublyLinkedListNode nextNode =
                current.next;

        previousNode.next = nextNode;
        nextNode.previous = previousNode;

        size--;

        return removedData;
    }

    // Search for a value and return its index
    public int search(int data) {

        DoublyLinkedListNode current = head;

        int index = 0;

        while (current != null) {

            if (current.data == data) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    // Check whether a value exists
    public boolean contains(int data) {

        return search(data) != -1;
    }

    // Display from head to tail
    public void displayForward() {

        System.out.print("[");

        DoublyLinkedListNode current = head;

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" <-> ");
            }

            current = current.next;
        }

        System.out.println("]");
    }

    // Display from tail to head
    public void displayBackward() {

        System.out.print("[");

        DoublyLinkedListNode current = tail;

        while (current != null) {

            System.out.print(current.data);

            if (current.previous != null) {
                System.out.print(" <-> ");
            }

            current = current.previous;
        }

        System.out.println("]");
    }

    // Remove all elements
    public void clear() {

        head = null;
        tail = null;
        size = 0;
    }

    // Display the current state of the list
    public void display() {

        displayForward();
    }
}