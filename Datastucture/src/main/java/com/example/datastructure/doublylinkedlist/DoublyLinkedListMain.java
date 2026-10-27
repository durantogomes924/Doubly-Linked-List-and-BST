package com.example.datastructure.doublylinkedlist;

public class DoublyLinkedListMain {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       DOUBLY LINKED LIST");
        System.out.println("========================================");

        DoublyLinkedList list = new DoublyLinkedList();

        // Check empty list
        System.out.println("\n1. Initial State");
        System.out.println("Is empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());

        // Add elements at the end
        System.out.println("\n2. Add Elements at End");

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.print("Forward:  ");
        list.displayForward();

        System.out.print("Backward: ");
        list.displayBackward();

        System.out.println("Size: " + list.size());

        // Add element at beginning
        System.out.println("\n3. Add Element at Beginning");

        list.addFirst(5);

        System.out.print("Forward:  ");
        list.displayForward();

        System.out.print("Backward: ");
        list.displayBackward();

        // Insert in middle
        System.out.println("\n4. Insert Element in Middle");

        list.insert(3, 25);

        System.out.print("After inserting 25 at index 3: ");
        list.displayForward();

        // Get
        System.out.println("\n5. Get Element");

        System.out.println(
                "Element at index 2: " + list.get(2));

        // Set
        System.out.println("\n6. Update Element");

        list.set(2, 15);

        System.out.print("After set(2, 15): ");
        list.displayForward();

        // Search
        System.out.println("\n7. Search");

        System.out.println(
                "Index of 30: " + list.search(30));

        System.out.println(
                "Index of 100: " + list.search(100));

        // Contains
        System.out.println("\n8. Contains");

        System.out.println(
                "Contains 25? " + list.contains(25));

        System.out.println(
                "Contains 100? " + list.contains(100));

        // Remove first
        System.out.println("\n9. Remove First");

        int removedFirst = list.removeFirst();

        System.out.println(
                "Removed: " + removedFirst);

        System.out.print("List: ");
        list.displayForward();

        // Remove last
        System.out.println("\n10. Remove Last");

        int removedLast = list.removeLast();

        System.out.println(
                "Removed: " + removedLast);

        System.out.print("List: ");
        list.displayForward();

        // Remove middle
        System.out.println("\n11. Remove from Middle");

        int removed = list.remove(2);

        System.out.println(
                "Removed: " + removed);

        System.out.print("List: ");
        list.displayForward();

        // Test backward traversal
        System.out.println("\n12. Backward Traversal");

        System.out.print("Backward: ");
        list.displayBackward();

        // Test invalid index
        System.out.println("\n13. Invalid Index Test");

        try {

            list.get(100);

        } catch (IndexOutOfBoundsException e) {

            System.out.println(
                    "Error handled: " + e.getMessage());
        }

        // Clear
        System.out.println("\n14. Clear List");

        list.clear();

        System.out.print("After clear: ");
        list.displayForward();

        System.out.println(
                "Size: " + list.size());

        System.out.println(
                "Is empty? " + list.isEmpty());

        System.out.println("\n========================================");
        System.out.println("       DLL TEST COMPLETED");
        System.out.println("========================================");
    }
}