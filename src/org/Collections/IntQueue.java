//package org.Collections;
//
//public class IntQueue {
//
//    private Node front;
//    private Node rear;
//    private int size;
//
//    /**
//     * Pushes element onto this stack.
//     * @param element The element to push onto this stack.
//     */
//
//    public void push(int element) {
//        Node temp = new Node(element);
//        if(isEmpty()){
//            front = temp;
//        }
//        else {
//            rear.next = temp;
//        }
//        rear = temp;
//        size++;
//    }
//
//    /**
//     * Pulls the last value pushed onto this stack.
//     */
//
//    public void pull() {}
//
//    /**
//     * Retrieve without removal
//     * @return element
//     */
//
//    public int peek() {
//        int element;
//        return element;
//    }
//
//    /**
//     * Returns size (element count) of the queue.
//     * @return size;
//     */
//
//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//}
