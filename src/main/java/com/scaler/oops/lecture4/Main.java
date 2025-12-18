package com.scaler.oops.lecture4;

public class Main {
    public static void main(String[] args) {

        // We cannot instantiate an interface, as it does not have method implementations
//        Stack stack = new Stack();

        Stack stack = new LinkedListBasedStack();
        stack.push(10);
        stack.push(20);
        stack.pop();
    }

}
