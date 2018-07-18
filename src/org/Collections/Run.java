package org.Collections;

public class Run {

    public static void main(String... arg) {


        IntStack myStack = new IntStack(4);
        System.out.println(myStack.isEmpty());

        myStack.push(1);
        System.out.println(myStack.isEmpty()); // testing addition
        System.out.println(myStack.peek());

        myStack.push(2);
        System.out.println(myStack.peek());

        myStack.push(3);
        System.out.println(myStack.peek());

        myStack.push(4);
        System.out.println(myStack.peek());

        myStack.push(5); // testing boundaries

        myStack.pop();
        System.out.println(myStack.peek());






    }
}
