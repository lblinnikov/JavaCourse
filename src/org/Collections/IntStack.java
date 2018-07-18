package org.Collections;

class IntStack {

    private Integer maxSize;
    private Integer top;
    private Integer arr[];

    IntStack(int size) {
        maxSize = size;
        arr = new Integer[maxSize];
        top = 0;
    }

    /**
     * Pushes element onto this stack.
     * @param element The element to push onto this stack.
     */

//    void push(Integer element) throws StackOverflowError {
//        if(top < maxSize) {
//            arr[top] = element;
//            top++;
//        }
//        else {
//            throw new StackOverflowError("Stack overflow!");
//        }
//    }

    void push(Integer element) {
        if(top < maxSize) {
            arr[top] = element;
            top++;
        }
        else {
            System.out.println("Stack overflow!");
        }
    }


    /**
     * Pops the last value pushed onto this stack.
     */

    // I chose Integer instead of int because otherwise there was error when tyring to return null
    Integer pop() {
        if(isEmpty()) {                 // or this.isEmpty()
            int temp = this.peek();
            arr[top-1] = null;
            top--;
            return temp;
        }
        else {
            return null;
        }
    }

    /**
     * Retrieve without removal
     * @return element
     */

    Integer peek() {
        if(top > 0){
            return arr[top-1];
        }
        else return null;
    }

    /**
     * Returns if stack is empty
     */

    boolean isEmpty() {
        return top == 0;
    }

}
