package com.scaler.oops.lecture3;

public class C extends B {
    /** If we make the default Constructor as private or declare any custom constructor without explicitly defining default constructor,
     * the child class won't be able to call it, and hence would throw error **/
//    private C() {
//        System.out.println("C's Constructor is called");
//    }

    C() {
        System.out.println("C's Constructor is called");
    }
}
