package com.bridgelabz;

/**
 * Ability to delete the first element from the linked list
 */

public class UserDefinedLinkedList {
    /**
     * Initializing head and tail variables of Node type
     */
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
     * Logic for adding nodes to linked list
     * @param newNode
     */
    public void add(Node newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);
        }
    }

    /**
     * Logic for appending the nodes to linked list
     * @param newNode
     */
    public void append(Node newNode){
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }


    /**
     * Creating insert method to insert one node in the middle
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
     * Creating the pop method to delete the first element in the linked list
     */
    public void pop() {
        if (this.head == null) {
        }
        Node tempNode = this.head;
        this.head = tempNode.getNext();
        tempNode = null;
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
         * 4.Displaying the linked list after adding the nodes
         * 5.Calling the pop method to delete the first element from the linked list
         * 6.calling display method with object reference to display the linked list after deleting
         */

        /**
         * 1. Creating User Defined linked list
         */
        UserDefinedLinkedList userDefinedLinkedList = new UserDefinedLinkedList();

        /**
         * 2.creating 3 nodes with 56, 70 and inserting 30 in the middle
         */
        Node head = new Node(70);
        Node middle = new Node(30);
        Node tail = new Node(56);

        /**
         * 3.Adding nodes to linked list
         */
        userDefinedLinkedList.add(head);
        userDefinedLinkedList.add(middle);
        userDefinedLinkedList.add(tail);
        /**
         * 4.Displaying the linked list after adding the nodes
         */
        userDefinedLinkedList.display();
        /**
         * 5.Calling the pop method to delete the first element from the linked list
         */
        userDefinedLinkedList.pop();
        /**
         * 6.calling display method with object reference to display the linked list after deleting
         */
        userDefinedLinkedList.display();
    }
}




