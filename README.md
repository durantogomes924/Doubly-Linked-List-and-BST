# Implementation and Analysis of Doubly Linked List and Binary Search Tree

This repository contains a comprehensive Java implementation of two fundamental data structures—**Doubly Linked List** and **Binary Search Tree (BST)**—built from scratch without relying on built-in collection libraries[cite: 7, 13]. 

## 🚀 Features

### 1. Doubly Linked List (DLL)
* **Node Architecture:** Bidirectional links (`prev` and `next`) with a dedicated Head and Tail reference[cite: 8].
* **Core Operations:** Insertion (`addFirst`, `addLast`, index-based), deletion (`removeFirst`, `removeLast`, index-based), updates (`set`), searches (`search`, `contains`), and traversal (`displayForward`, `displayBackward`)[cite: 8, 9].
* **Error Handling:** Robust validation for invalid index access (e.g., out-of-bounds checks)[cite: 5, 10].

### 2. Binary Search Tree (BST)
* **Node Architecture:** Hierarchical nodes with data fields and references to left and right child subtrees.
* **Core Operations:** Insertion (with duplicate value suppression), searching, finding minimum/maximum, height calculation, and node counting[cite: 11].
* **Traversals:** In-order, pre-order, and post-order traversal algorithms[cite: 11, 12].
* **Deletion Handling:** Complete support for all three deletion cases (Leaf Node, Single-Child Node, and Two-Child Node)[cite: 12].

---

## 🛠️ Project Structure

```text
src/
└── main/
    └── java/
        ├── com/
        │   └── example/
        │       └── datastucture/
        │           ├── bst/
        │           │   ├── BSTNode.java
        │           │   ├── BinarySearchTree.java
        │           │   └── BSTMain.java
        │           └── doublylinkedlist/
        │               ├── DoublyLinkedListNode.java
        │               ├── DoublyLinkedList.java
        │               └── DoublyLinkedListMain.java
