package org.example;
import org.example.Multrithreading.MultiThreading;
import org.example.Multrithreading.MultiThreadingUsingLock;
import org.example.Multrithreading.MultiThreadingUsingThreadClass;
import org.example.Multrithreading.RunnableDemo;
import org.example.Multrithreading.LockObject;
import org.example.Practise.Arrays;
import org.example.Practise.BufferWriterAndReader;
import org.example.Practise.WritingAndReading;
import java.io.*;
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Collection;
import static java.lang.Integer.parseInt;
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        // RunnableDemo R1 = new RunnableDemo( "Thread-1");
        // R1.start();
        
        // RunnableDemo R2 = new RunnableDemo( "Thread-2");
        // R2.start();
    
        MultiThreadingUsingLock multiThreadingUsingLock = new MultiThreadingUsingLock(new LockObject(), "T1");
        MultiThreadingUsingLock multiThreadingUsingLock2 = new MultiThreadingUsingLock(new LockObject(), "T2");
        multiThreadingUsingLock.start();
        multiThreadingUsingLock2.start();
        // MultiThreading multiThreading = new MultiThreading("T1");
        // MultiThreading multiThreading2 = new MultiThreading("T2");
        // Thread thread = new Thread(multiThreading);
        // Thread thread2 = new Thread(multiThreading2);
        // thread.start();
        // thread2.start();
        // thread.interrupt();
        // System.out.println("Checkpoint 1 ");
        // System.out.println("Thread Name: "  + Thread.currentThread().getName());
        // thread2.join();
        // System.out.println("Checkpoint 2");

        // Thread th = new Thread(){
        //     @Override
        //     public void run(){
        //         System.out.println("anonymous class thread");
        //     }
        // };
        // th.start();
//        WritingAndReading writingAndReading = new WritingAndReading();
//        writingAndReading.writeInAFile("out.txt",data);
//        writingAndReading.readFromFile("out.txt");
//        BufferWriterAndReader bufferWriterAndReader = new BufferWriterAndReader();
//        bufferWriterAndReader.bufferedWriter("out.txt", data);
//        bufferWriterAndReader.bufferedReader("out.txt");

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String name = bufferedReader.readLine();
////        char x = name.charAt(0);
////        System.out.println(x);
//        bufferedReader.close();
//
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//        bufferedWriter.write(name);
//        bufferedWriter.flush();
//        bufferedWriter.close();
//        StringBuilder sb = new StringBuilder("JavaScript");
//        sb.replace(1, 4, "ghjgjhgjhgjgjgjgjl");
//        System.out.println(sb);
//        Collection c = new ArrayList();
    //    BufferWriterAndReader bufferWriterAndReader = new BufferWriterAndReader();
    //    bufferWriterAndReader.bufferedReader("out.txt");

    }

}