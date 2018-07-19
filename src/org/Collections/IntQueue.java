package org.Collections;

import java.util.NoSuchElementException;

public class IntQueue {

    private Node front;
    private Node rear;
    private int size;

    IntQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    /**
     * Pushes element in this queue.
     * @param element The element to push in this queue.
     */

    void push(int element) {
        Node temp = new Node(element);
        if(isEmpty()){
            front = temp;
        }
        else {
            rear.next = temp;
        }
        rear = temp;
        size++;
    }

    /**
     * Pulls the last value pushed onto this queue.
     */

    int pull() {
        if(isEmpty()){
            throw new NoSuchElementException("Empty queue");
        }
        int result = front.data;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        size--;
        return result;
    }

    /**
     * Retrieve without removal
     * @return element
     */

    int peek() {
        if(isEmpty()){
            throw new NoSuchElementException("Empty queue");
        }
        return front.data;
    }

    /**
     * Returns size (element count) of the queue.
     * @return size;
     */

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    void print(){
        if(isEmpty()){
            return;
        }
        Node current = front;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
    }

}
