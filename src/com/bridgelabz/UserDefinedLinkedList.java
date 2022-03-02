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
        Node node = this.head;
        System.out.print("Linked List Sequence: ");
        while (node != null) {
            System.out.print(node.getData() + (node.getNext() == null ? "" : "->"));
            node = node.getNext();
        }
    }

    /**
     * @param newNode
     */
    public void add(Node newNode){
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);
        }
    }

    public static void main(String[] args) {
        UserDefinedLinkedList userDefinedLinkedList = new UserDefinedLinkedList();
        Node head = new Node(70);
        Node middle = new Node(30);
        Node tail = new Node(56);

        userDefinedLinkedList.add(head);
        userDefinedLinkedList.add(middle);
        userDefinedLinkedList.add(tail);

        userDefinedLinkedList.display();
    }
}




