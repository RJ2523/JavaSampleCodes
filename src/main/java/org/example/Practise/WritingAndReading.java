package org.example.Practise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class WritingAndReading {
    public void writeInAFile(String filename, String data){
        try{
            FileWriter fileWriter = new FileWriter(filename);
            for(int i = 0 ; i < data.length() ; i++)
                fileWriter.write(data.charAt(i));
            fileWriter.close();
        }catch (IOException io){
            System.out.println("Cannot write to this file");
        }
    }

    public void readFromFile(String fileName){
        try{
            FileReader fileReader = new FileReader(fileName);
            int ch;
            while((ch=fileReader.read())!=-1)
                System.out.print((char) ch);
            fileReader.close();
        }catch (FileNotFoundException fe){
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
