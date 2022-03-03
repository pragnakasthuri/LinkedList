package com.bridgelabz;

/**
 * Ability to insert 30 between 56 and 70
 */

public class UserDefinedLinkedList {
    private Node head;
    private Node tail;

    /**
     * Traverse through the node and prints the data
     */
    public void display() {
        Node node = this.head;
        System.out.print("Linked List Sequence: ");
        while (node != null) {
            System.out.print(node.getData() + (node.getNext() == null ? "" : "->"));
            node = node.getNext();
        }
    }

    /**
     * Creating insert method to insert one node in the middle of two nodes
     * @param newNode
     */
    public void insert(Node newNode){
        if (this.head == null) {
            this.head = newNode;
        }
        Node tempNode = head.getNext();
        head.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /**
     * Main method for manipulating Linked list
     * @param args - Default Java param (Not used)
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE
         * 1. Creating user Defined linked list
         * 2.creating 3 nodes with 56, 70 and inserting 30 in the middle
         * 3.Adding nodes to linked list
         * 4.calling display method with object reference
         */
        /**
         * 1. Creating user Defined linked list
         */
        UserDefinedLinkedList userDefinedLinkedList = new UserDefinedLinkedList();

        /**
         * 2.creating 3 nodes with 56, 70 and inserting 30 in the middle
         */
        Node head = new Node(56);
        Node middle = new Node(70);
        Node tail = new Node(30);

        /**
         * 3.Adding nodes to linked list
         */
        userDefinedLinkedList.insert(head);
        userDefinedLinkedList.insert(middle);
        userDefinedLinkedList.insert(tail);
        /**
         * 4.calling display method with object reference
         */
        userDefinedLinkedList.display();
    }
}




