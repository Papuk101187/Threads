package org.example;

import lombok.SneakyThrows;
import org.example.arithmetic.Arithmetic;
import org.example.arithmetic.ReadFilesArithmetic;

public class MyRunnable implements Runnable {

    Arithmetic arithmetic;
    private int counts;
    Object mono = new Object();


    public MyRunnable(Arithmetic arithmetic, int counts) {
        this.arithmetic = arithmetic;
        this.counts = counts;
    }

    @SneakyThrows
    public void run() {

        for (int j = 0; j < counts; j++) {

            synchronized (Object.class) {

            }


        }


    }
}
