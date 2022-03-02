package com.bridgelabz;

/**
 * Ability to create Linked List by adding 30 and 56 to 70
 */

public class UserDefinedLinkedList {
    private Node head;
    private Node tail;

    /**
     * Traverse through the node and prints the data
     */
    public void display() {
        Node node = this.tail;
        System.out.print("Linked List Sequence: ");
        while (node != null) {
            System.out.print(node.getData() + (node.getNext() == null ? "" : "->"));
            node = node.getNext();
        }
    }

    public static void main(String[] args) {
        UserDefinedLinkedList userDefinedLinkedList = new UserDefinedLinkedList();
        Node head = new Node(70);
        Node middle = new Node(30);
        Node tail = new Node(56);
        
        tail.setNext(middle);
        middle.setNext(head);

        userDefinedLinkedList.tail = tail;
        userDefinedLinkedList.display();
    }
}




