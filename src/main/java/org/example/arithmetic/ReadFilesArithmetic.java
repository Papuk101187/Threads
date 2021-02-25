package org.example.arithmetic;

import java.io.*;


public class ReadFilesArithmetic {

    public void action(int j) throws IOException {

        String numbe;
        int summa = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers.txt"));

        while ((numbe = bufferedReader.readLine()) != null) {
            int numbers = Integer.parseInt(numbe);
            summa = summa + numbers;
        }
        addFile(String.valueOf(summa));
    }

    public String addFile(String string) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt", true))) {
            bw.write(string + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
