package org.example.arithmetic;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReadFilesArithmetic implements Arithmetic {

    ArrayList arrayList = new ArrayList<>();
    int summ = 0;

    @Override
    public void action(int j) throws FileNotFoundException {

        String numbers;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers.txt"));

        String a = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
        String[] as = a.split(",");

        for (String s : as) {
            addFile(s);
        }


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
