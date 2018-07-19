package org.Collections;

class Node { // linked list node

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
