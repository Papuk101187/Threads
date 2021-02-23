package org.example.arithmetic;

import java.io.*;
import java.util.ArrayList;

public class ParserFilesArithmetic implements Arithmetic {

    ArrayList File = new ArrayList();


    @Override
    public void action(int j) throws IOException {

        String telephone;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));

        while ((telephone = bufferedReader.readLine()) != null) {
            addFile(telephone);
        }

    }

    public String addFile(String telephone) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt", true))) {
            bw.write(telephone + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
