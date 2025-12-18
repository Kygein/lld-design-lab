package com.scaler.oops.concurrency2;

// Print numbers from 1 to 10 each via different threads
public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            // Creating Multiple threads, might result in inefficient resource usage and memory overhead
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
