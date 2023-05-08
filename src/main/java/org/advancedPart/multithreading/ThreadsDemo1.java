package org.advancedPart.multithreading;

public class ThreadsDemo1 {
    public static void main(String[] args) {
        //1. create task for worker
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    System.out.println("Working on another thread...");
                }
            }
        };
        //2. create worker + give task to worker
        Thread worker = new Thread(task);

        //3. instruct worker to start working
        worker.start();
        for (int i = 0; i < 5000; i++) {
            System.out.println("MAIN THREAD");
        }
    }
}
