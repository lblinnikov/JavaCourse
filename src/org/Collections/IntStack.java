package org.Collections;

class IntStack {

    Integer maxSize;
    Integer top;
    Integer arr[];

    IntStack(int size) {
        maxSize = size;
        arr = new Integer[maxSize];
        top = 0;
    }

    /**
     * Pushes element onto this stack.
     * @param element The element to push onto this stack.
     */

    void push(Integer element) throws StackOverflowError {
        if(top < maxSize) {
            arr[top] = element;
            top++;
        }
        else {
            throw new StackOverflowError("Stack overflow!");
        }
    }

    /**
     * Pops the last value pushed onto this stack.
     */

    Integer pop() {
        if(this.isEmpty()) {
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
        if(top == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
