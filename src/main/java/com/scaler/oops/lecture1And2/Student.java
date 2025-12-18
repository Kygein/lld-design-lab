package com.scaler.oops.lecture1And2;

public class Student {

    private String name;
    int age;
    String batch;
    double psp;
    double attendance;

    /** Default Constructor **/
    Student(){ }

    /** Custom Constructor **/
    Student(String name, String batch, int age) {
        this.name = name;
        this.batch = batch;
        this.age = age;
    }

    /** This Constructor Overloading will not work, as both the datatypes are same, so compiler will experience ambiguity **/
    Student(String name) {
        this.name=name;
    }
//    Student(String batch){
//        this.batch=batch;
//    }

     /** Copy Constructor **/
     Student(Student student) {
         this.name=student.name;
         this.batch=student.batch;
         this.age=student.age;
         this.attendance=student.attendance;
         this.psp=student.psp;
     }


}
