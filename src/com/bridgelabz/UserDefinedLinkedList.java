package com.bridgelabz;

/**
 * Ability to create Linked List by appending 30 and 70 to 56
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
    public void append(Node newNode){
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public static void main(String[] args) {
        UserDefinedLinkedList userDefinedLinkedList = new UserDefinedLinkedList();
        Node head = new Node(56);
        Node middle = new Node(30);
        Node tail = new Node(70);

        userDefinedLinkedList.append(head);
        userDefinedLinkedList.append(middle);
        userDefinedLinkedList.append(tail);

        userDefinedLinkedList.display();
    }
}




