package org.example.arithmetic;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave {

    Object monitor = new Object(); // монитор для синхронизации


    public void readFiles(String string) {
        synchronized (monitor) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt", true))) {
                bw.write(string + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
