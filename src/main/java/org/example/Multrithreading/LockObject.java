package org.example.Multrithreading;

public class LockObject {

    public synchronized void printNumbers(Thread t){
        for(int i = 5 ; i > 0 ; i--){
            System.out.println(i);
        }
    }
   
}
