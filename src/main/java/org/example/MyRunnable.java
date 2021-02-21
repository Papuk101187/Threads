package org.example;
import org.example.arithmetic.Arithmetic;
import org.example.arithmetic.ReadFilesArithmetic;

public class MyRunnable implements Runnable {


    Arithmetic arithmetic;

    public int count = 0;

    public MyRunnable(Arithmetic fibonacciArithmetic) {
        arithmetic = fibonacciArithmetic;
    }


    public int getCount() {
        return count;
    }


    public void run() {

        for(int j=0;j<10;j++){


        }
    }





}
