package com.example.datastructure.bst;

public class BinarySearchTree {

    private BSTNode root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    // Check whether the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Return the number of nodes
    public int size() {
        return size;
    }

    // Insert a new value
    public void insert(int data) {

        if (root == null) {
            root = new BSTNode(data);
            size++;
            return;
        }

        root = insertRecursive(root, data);
    }

    private BSTNode insertRecursive(BSTNode node, int data) {

        if (node == null) {
            size++;
            return new BSTNode(data);
        }

        if (data < node.data) {

            node.left = insertRecursive(node.left, data);

        } else if (data > node.data) {

            node.right = insertRecursive(node.right, data);

        } else {

            System.out.println(
                    "Duplicate value ignored: " + data
            );
        }

        return node;
    }

    // Search for a value
    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(BSTNode node, int data) {

        if (node == null) {
            return false;
        }

        if (data == node.data) {
            return true;
        }

        if (data < node.data) {
            return searchRecursive(node.left, data);
        }

        return searchRecursive(node.right, data);
    }

    // Find minimum value
    public int findMin() {

        if (isEmpty()) {
            throw new IllegalStateException(
                    "Tree is empty"
            );
        }

        BSTNode current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    // Find maximum value
    public int findMax() {

        if (isEmpty()) {
            throw new IllegalStateException(
                    "Tree is empty"
            );
        }

        BSTNode current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    // In-order traversal
    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(BSTNode node) {

        if (node == null) {
            return;
        }

        inOrderRecursive(node.left);

        System.out.print(node.data + " ");

        inOrderRecursive(node.right);
    }

    // Pre-order traversal
    public void preOrder() {
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(BSTNode node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");

        preOrderRecursive(node.left);

        preOrderRecursive(node.right);
    }

    // Post-order traversal
    public void postOrder() {
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(BSTNode node) {

        if (node == null) {
            return;
        }

        postOrderRecursive(node.left);

        postOrderRecursive(node.right);

        System.out.print(node.data + " ");
    }

    // Delete a value
    public void delete(int data) {

        if (!search(data)) {
            System.out.println(
                    "Value not found: " + data
            );
            return;
        }

        root = deleteRecursive(root, data);

        size--;
    }

    private BSTNode deleteRecursive(
            BSTNode node,
            int data) {

        if (node == null) {
            return null;
        }

        if (data < node.data) {

            node.left = deleteRecursive(
                    node.left,
                    data
            );

        } else if (data > node.data) {

            node.right = deleteRecursive(
                    node.right,
                    data
            );

        } else {

            // Case 1: Node has no children
            if (node.left == null &&
                    node.right == null) {

                return null;
            }

            // Case 2: Node has only right child
            if (node.left == null) {
                return node.right;
            }

            // Case 2: Node has only left child
            if (node.right == null) {
                return node.left;
            }

            // Case 3: Node has two children
            int successorValue =
                    findMinValue(node.right);

            node.data = successorValue;

            node.right = deleteRecursive(
                    node.right,
                    successorValue
            );
        }

        return node;
    }

    // Find minimum value in a subtree
    private int findMinValue(BSTNode node) {

        BSTNode current = node;

        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    // Calculate tree height
    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(BSTNode node) {

        if (node == null) {
            return 0;
        }

        int leftHeight =
                heightRecursive(node.left);

        int rightHeight =
                heightRecursive(node.right);

        return 1 + Math.max(
                leftHeight,
                rightHeight
        );
    }

    // Count nodes
    public int countNodes() {
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(BSTNode node) {

        if (node == null) {
            return 0;
        }

        return 1
                + countNodesRecursive(node.left)
                + countNodesRecursive(node.right);
    }

    // Clear the tree
    public void clear() {

        root = null;
        size = 0;
    }

    // Display all traversals
    public void displayTraversals() {

        System.out.print("In-order:   ");
        inOrder();

        System.out.print("Pre-order:  ");
        preOrder();

        System.out.print("Post-order: ");
        postOrder();
    }
}