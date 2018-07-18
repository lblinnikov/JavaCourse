package org.Collections;

class Node {

    private int data;

    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        return data+"";
    }
}
