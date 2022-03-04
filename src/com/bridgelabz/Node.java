package com.bridgelabz;

/**
 * Generic class
 * @param <D>
 */

public class Node<D extends Comparable> {
    private D data;
    private Node next;

    /**
     * @param data
     */
    public Node(D data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Declaring getter and setter methods for data and next
     */

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
