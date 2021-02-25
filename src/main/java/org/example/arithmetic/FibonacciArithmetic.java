package org.example.arithmetic;


public class FibonacciArithmetic {
    int fibona = 16;

    private int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        return fibonacci(number - 2) + fibonacci(number - 1);
    }

    public void action() {
        for(int j=0;j<15;j++) {

            if (j == 15) {
                fibona = fibonacci(j);
                System.out.println("На " + j + " число фибоначи = " + fibona);
            }
        }

    }
}
