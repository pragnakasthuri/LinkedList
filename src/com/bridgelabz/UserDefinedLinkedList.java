package com.bridgelabz;

/**
 * Ability to insert 40 after 30 int eh linked list sequence
 */

public class UserDefinedLinkedList {
    /**
     * Initializing head and tail variables of type Node
     */
    private Node head;
    private Node tail;

    /**
     * Traverse through the node and prints the data
     */
    public void display() {
        Node node = this.head;
        System.out.println();
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

    public void insertAfter(Node newNode, int data) {
        if (this.head == null) {
            return;
        }
        Node temp = this.head;
        while(!temp.getData().equals(data)) {
            temp = temp.getNext();
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
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
     * Creating popLast method to delete last element from the linked list
     */
    public void popLast(){
        if (this.head == null) {
            return;
        }
        if (this.head.getNext() == null) {
            return;
        }
        Node tempNode = this.head;
        while(tempNode.getNext().getNext() != null) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(null);
        this.tail = tempNode;
    }

    /**
     * Creating search method to search the desired element
     * @param data
     * @return address of node
     */
    public Node searchData(int data) {
        if(this.head == null){
            return null;
        }

        Node tempNode = this.head;
        while(tempNode != null) {
            if (tempNode.getData().equals(data)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }




    /**
     * Main method for manipulating Linked list
     * @param args - Default Java param (Not used)
     */
    public static void main(String[] args) {
        /**
         * PROCEDURE
         * 1.Creating user Defined linked list
         * 2.Creating 3 nodes with 56, 70 and inserting 30 in the middle
         * 3.Adding nodes to linked list
         * 4.Displaying the linked list after adding the nodes
         * 5.Calling the insertAfter method to insert 40 after 30
         * 6.Displaying the linked list after inserting 40 after 30
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
         * 5.Calling the insertAfter method to insert 40 after 30
         */
        userDefinedLinkedList.insertAfter(new Node(40), 30);
        /**
         * 6.Displaying the linked list after inserting 40 after 30
         */
        userDefinedLinkedList.display();

    }
}




