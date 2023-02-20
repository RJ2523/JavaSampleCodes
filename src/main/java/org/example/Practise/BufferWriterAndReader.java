package org.example.Practise;

import java.io.*;

public class BufferWriterAndReader {
    public void bufferedWriter(String fileName, String data) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public void bufferedReader(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String myString;
        while((myString = bufferedReader.readLine())!=null){
            System.out.println(myString);
        }
    }
}
