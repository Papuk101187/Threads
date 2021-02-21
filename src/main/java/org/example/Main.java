package org.example;

import org.example.arithmetic.FibonacciArithmetic;
import org.example.arithmetic.ParserFilesArithmetic;
import org.example.arithmetic.ReadFilesArithmetic;

public class Main {


    public static void main(String[] args) {


        MyRunnable myRunnable1 = new MyRunnable(new FibonacciArithmetic());
        MyRunnable myRunnable2 = new MyRunnable(new ReadFilesArithmetic());
        MyRunnable myRunnable3 = new MyRunnable(new ParserFilesArithmetic());

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);
        Thread thread3 = new Thread(myRunnable3);






    }






}
