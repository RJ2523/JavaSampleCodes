package org.example.Multrithreading;

public class MultiThreadingUsingThreadClass extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i < 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(4000);
            System.out.println("waiting time finished");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
