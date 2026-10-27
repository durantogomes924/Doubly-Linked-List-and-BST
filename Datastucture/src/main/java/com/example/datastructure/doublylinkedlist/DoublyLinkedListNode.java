package com.example.datastructure.doublylinkedlist;

public class DoublyLinkedListNode {

    int data;
    DoublyLinkedListNode previous;
    DoublyLinkedListNode next;

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}