package org.Collections;

class Node {

    private int data;

    private Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return data+"";
    }
}
