package org.Collections;

import java.util.EmptyStackException;

class IntStackLinkedList {

    private Node top;
    private int length;

    IntStackLinkedList() {
        top = null;
        length = 0;
    }

    /**
     * Pushes element onto this stack.
     * @param element The data to push onto this stack.
     */

    void push(int element) {
        Node temp = new Node(element);
        temp.next = top;
        top = temp;
        length++;
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
        length--;
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

    boolean isEmpty() {
        return length == 0;
    }

    int length(){
        return length;
    }

}
