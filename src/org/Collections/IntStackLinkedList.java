package org.Collections;

import java.util.EmptyStackException;

class IntStackLinkedList {

    private Node top;
    private int size;

    IntStackLinkedList() {
        this.top = null;
        this.size = 0;
    }

    /**
     * Pushes element onto this stack.
     * @param element The data to push onto this stack.
     */

    void push(int element) {
        Node temp = new Node(element);
        temp.next = top;
        top = temp;
        size++;
    }

    /**
     * Pops the last value pushed onto this stack.
     */

    int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        size--;
        return result;
    }

    /**
     * Retrieve without removal
     * @return element
     */

    int peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    /**
     * Returns if stack is empty
     */

    private boolean isEmpty() {
        return size == 0;
    }

}
