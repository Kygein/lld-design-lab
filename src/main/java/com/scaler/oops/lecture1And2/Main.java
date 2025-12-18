package com.scaler.oops.lecture1And2;

public class Main {

    public static void main(String[] args) {
        /** Default Constructor is called.
         * If we create our own Constructor, Default Constructor will not be provided by Compiler.
         * So just add a default Constructor **/
        Student student = new Student();

        System.out.println(student);
        System.out.println(student.age);
        System.out.println(student.psp);
        System.out.println(student.batch);
        /** Private variables cannot be accessed from outside Class **/
//        System.out.println(student.name);

        Student student1 = new Student("Swapnil", "Java", 25);

        System.out.println(student);
        System.out.println(student1);

        /** This is not a Copy Object, as it is not at all creating an object **/
//        Student studentCopy = student1;

        /** 1. Creating a Copy Object. But this is not a good approach of creating a copy object **/
//        Student studentCopy = new Student();
//        studentCopy.batch = student1.batch;
//        studentCopy.age = student1.age;

        /** 2. Creating a Copy using Copy Constructor **/
        /** This is Shallow Copy. The Copy objects share the common resources.
         * So if one changes, the copy values also gets reflected, in the copy object
         **/
        Student student1Copy = new Student(student1);

        System.out.println("DEBUG MODE !!! ");

    }
}
