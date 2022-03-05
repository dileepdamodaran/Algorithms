package javacode;

import java.time.LocalDateTime;

public class MultiThreadDemo implements Runnable {

    @Override
    public void run() {
        try{
            System.out.println("Thread " + LocalDateTime.now()+ "  :::: "
                    + Thread.currentThread().getId()+ " is running");
        }
        catch (Exception e){

        }
    }
}
