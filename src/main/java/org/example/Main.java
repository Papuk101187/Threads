package org.example;
import org.example.arithmetic.FibonacciArithmetic;
import org.example.arithmetic.ParserFilesArithmetic;
import org.example.arithmetic.ReadFilesArithmetic;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {


        MyRunnable myRunnable1 = new MyRunnable(new FibonacciArithmetic(), 16); // фибоначи
        MyRunnable myRunnable2 = new MyRunnable(new ReadFilesArithmetic(), 1); // читаем файл с числами и суммируем
        MyRunnable myRunnable3 = new MyRunnable(new ParserFilesArithmetic(), 1); // парсим файл

        Thread thread1 = new Thread(myRunnable1);  // поток № 1
        Thread thread2 = new Thread(myRunnable2); // поток № 2
        Thread thread3 = new Thread(myRunnable3); // поток № 3

        thread1.start(); // запускаем поток № 1
        thread2.start(); // запускаем поток № 2
        thread3.start(); // запускаем поток № 3

        thread1.join(); // запускаем поток № 1
        thread2.join(); // запускаем поток № 2
        thread3.join(); // запускаем поток № 3


    }
}










