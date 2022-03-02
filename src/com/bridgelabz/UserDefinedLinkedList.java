package com.bridgelabz;

/**
 * Create a simple Linked List of 56, 30 and 70
 */

public class UserDefinedLinkedList {
    private Node head;
    private Node tail;

    /**
     * Traverse through the node and prints the data
     */
    public void display() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.getData() + " \n");
            node = node.getNext();
        }
    }

    public static void main(String[] args) {
        UserDefinedLinkedList userDefinedLinkedList = new UserDefinedLinkedList();
        Node head = new Node(56);
        Node middle = new Node(30);
        Node tail = new Node(70);

        head.setNext(middle);
        middle.setNext(tail);

        userDefinedLinkedList.head = head;
        userDefinedLinkedList.display();
    }
}




