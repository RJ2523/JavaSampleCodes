package org.example.Multrithreading;

public class MultiThreading implements Runnable {
    private String name;


    public MultiThreading(String threadName){
        name = threadName;
    }
    @Override
    public void run(){
        System.out.println("Thread Name: " + Thread.currentThread().getName());

        if(name.equals("T1")){
            try {
                Thread.sleep(5000);
                System.out.println("wait time finished");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    
    }
}
