package com.example.datastructure.bst;

public class BSTMain {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       BINARY SEARCH TREE");
        System.out.println("========================================");

        BinarySearchTree tree =
                new BinarySearchTree();

        // Initial state
        System.out.println("\n1. Initial State");

        System.out.println(
                "Is empty? " + tree.isEmpty());

        System.out.println(
                "Size: " + tree.size());

        // Insert values
        System.out.println("\n2. Insert Values");

        int[] values = {
                50, 30, 70, 20, 40,
                60, 80, 10, 25, 35, 45
        };

        for (int value : values) {
            tree.insert(value);
        }

        System.out.println(
                "Inserted values successfully.");

        System.out.println(
                "Size: " + tree.size());

        // Display tree traversals
        System.out.println("\n3. Tree Traversals");

        tree.displayTraversals();

        // Search
        System.out.println("\n4. Search");

        System.out.println(
                "Search 40: " + tree.search(40));

        System.out.println(
                "Search 100: " + tree.search(100));

        // Minimum
        System.out.println("\n5. Minimum");

        System.out.println(
                "Minimum value: " + tree.findMin());

        // Maximum
        System.out.println("\n6. Maximum");

        System.out.println(
                "Maximum value: " + tree.findMax());

        // Height
        System.out.println("\n7. Height");

        System.out.println(
                "Tree height: " + tree.height());

        // Count nodes
        System.out.println("\n8. Count Nodes");

        System.out.println(
                "Number of nodes: " +
                        tree.countNodes());

        // Duplicate
        System.out.println("\n9. Duplicate Test");

        tree.insert(40);

        // Delete leaf
        System.out.println("\n10. Delete Leaf Node");

        tree.delete(10);

        System.out.print(
                "In-order after deleting 10: ");

        tree.inOrder();

        // Delete node with one child
        System.out.println(
                "\n11. Delete Node with One Child");

        tree.delete(20);

        System.out.print(
                "In-order after deleting 20: ");

        tree.inOrder();

        // Delete node with two children
        System.out.println(
                "\n12. Delete Node with Two Children");

        tree.delete(30);

        System.out.print(
                "In-order after deleting 30: ");

        tree.inOrder();

        // Search after deletion
        System.out.println("\n13. Search After Deletion");

        System.out.println(
                "Search 30: " + tree.search(30));

        System.out.println(
                "Search 40: " + tree.search(40));

        // Delete nonexistent value
        System.out.println(
                "\n14. Delete Nonexistent Value");

        tree.delete(999);

        // Final state
        System.out.println("\n15. Final Tree");

        tree.displayTraversals();

        System.out.println(
                "Size: " + tree.size());

        System.out.println(
                "Height: " + tree.height());

        // Clear
        System.out.println("\n16. Clear Tree");

        tree.clear();

        System.out.println(
                "Is empty? " + tree.isEmpty());

        System.out.println(
                "Size: " + tree.size());

        System.out.println("\n========================================");
        System.out.println("       BST TEST COMPLETED");
        System.out.println("========================================");
    }
}