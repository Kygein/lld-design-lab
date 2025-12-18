package com.scaler.oops.concurrency1;

public class Main {
    public static void main(String[] args) {

        // A thread is always required to run any application, as it is the execution unit
        // Java by default creates a new thread to run our application
        System.out.println("Hello World !, This is printed by : " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        // (Step-2) Create a new thread and assign the task to it (Step-3)
        Thread thread1 = new Thread(helloWorldPrinter);

        // (Step-4) Start the thread
        thread1.start();

        Thread thread2 = new Thread(helloWorldPrinter);
        thread2.start();
        Thread thread3 = new Thread(helloWorldPrinter);
        thread3.start();
        Thread thread4 = new Thread(helloWorldPrinter);
        thread4.start();

        System.out.println("Hello World !, This is printed by : " + Thread.currentThread().getName());

    }
}

/**
 Task : Create a new thread and run the Hello World from New Thread

 Steps:
 1. Create a task that you want to execute in a new thread.
    -- Create a Task Class (With any name).
    -- Make this class implement Runnable interface.
    -- Implement run() method.
       -- In run method, Write the task to perform, here, (print "Hello World !, This is printed by : <thread-name>").
 2. Create a new thread
 3. Assign the task to the thread.
 4. Start the thread.

 NOTE - The Order of Thread Execution is random, as OS Scheduler decides which thread to run at what time.
        We may see different order of outputs on different runs.
        We can control the order of thread execution by assigning priorities to threads.
 **/
