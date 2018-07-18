package org.Collections;

public class IntStack {

    Integer maxSize;
    Integer top;
    Integer arr[];

    public IntStack(int size) {
        maxSize = size;
        arr = new Integer[maxSize];
        top = 0;
    }

    /**
     * Pushes element onto this stack.
     * @param element The element to push onto this stack.
     */

    public void push(Integer element) {
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

    public Integer pop() {
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

    public Integer peek() {
        if(top > 0){
            return arr[top-1];
        }
        else return null;
    }

    /**
     * Returns if stack is empty
     */

    public boolean isEmpty() {
        if(top == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
