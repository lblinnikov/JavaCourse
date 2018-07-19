package org.Collections;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null; // optional
    }

    public String toString() {
        return data + "";
    }
}
