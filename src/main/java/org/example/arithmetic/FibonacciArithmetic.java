package org.example.arithmetic;


public class FibonacciArithmetic implements Arithmetic {
    int fibona = 0;

    private int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return fibonacci(number - 2) + fibonacci(number - 1);
    }



    @Override
    public void action(int number) {
        if (number == 15) {
            fibona = fibonacci(number);
            System.out.println("На " +number + " число фибоначи = " + fibona);
        }

    }
}
