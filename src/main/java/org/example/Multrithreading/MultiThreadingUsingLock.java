package org.example.Multrithreading;

import java.util.concurrent.locks.Lock;

public class MultiThreadingUsingLock implements Runnable{
    private LockObject lockObject;
    private String threadName;
    private Thread thread;

    public MultiThreadingUsingLock(LockObject lockObject, String threadName){
        this.lockObject = lockObject;
        this.threadName = threadName;
    }

    public void run(){
        System.out.println("In run function");  
        lockObject.printNumbers(thread);
        
    }

    public void start(){
        System.out.println("Begin Execution");
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
