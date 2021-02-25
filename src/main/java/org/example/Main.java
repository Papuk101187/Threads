package org.example;
import lombok.SneakyThrows;
import org.example.arithmetic.FileSave;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        FileSave fileSave = new FileSave(); // для работы с файлами


        Thread thread1 = new Thread(new Runnable() {
            int fibona;

            @Override
            public void run() {

                for (int j = 0; j < 16; j++) {

                    if (j == 15) {
                        fibona = fibonacci(j);
                        System.out.println("На " + j + " число фибоначи = " + fibona);
                    }
                }
                fileSave.readFiles(String.valueOf(fibona));
            }

            private int fibonacci(int number) {
                if (number == 0) return 0;
                if (number == 1) return 1;
                return fibonacci(number - 2) + fibonacci(number - 1);
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                String numbe;
                int summa = 0;
                BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers.txt"));
                while ((numbe = bufferedReader.readLine()) != null) {
                    int numbers = Integer.parseInt(numbe);
                    summa = summa + numbers;
                }
                fileSave.readFiles(String.valueOf(summa));
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                String phone;
                BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
                while ((phone = bufferedReader.readLine()) != null) {
                    fileSave.readFiles(phone);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

    }
}










