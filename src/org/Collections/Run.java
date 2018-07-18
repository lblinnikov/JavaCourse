package org.Collections;

public class Run {

    public static void main(String... arg) {

        // arr impl
        IntStackArr myStack = new IntStackArr(4);
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


        // Linked list impl
        IntStackLinkedList lnkStack = new IntStackLinkedList();
        lnkStack.push(10);
        lnkStack.push(15);
        lnkStack.push(20);

        System.out.println(lnkStack.peek());

        lnkStack.pop();
        System.out.println(lnkStack.peek());

        lnkStack.pop();
        System.out.println(lnkStack.peek());

        lnkStack.pop();
        System.out.println(lnkStack.peek());

        lnkStack.pop(); // err?

    }
}
