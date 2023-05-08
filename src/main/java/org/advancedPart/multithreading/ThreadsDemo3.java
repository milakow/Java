package org.advancedPart.multithreading;

import java.util.Scanner;

public class ThreadsDemo3 {
    public static void main(String[] args) throws InterruptedException {


        Printer printer = new Printer();
        Thread thread = new Thread(printer);


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run()  {
                try {
                    Thread.sleep(100);
//                    thread.stop(); // this is not safe, method has bugs and should not be used - use simple logic instead
                    printer.setRunning(false);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        thread2.start();

    }


}

class Printer implements Runnable{

    private boolean running = true;

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            System.out.println(i);
            if (!running) {
                System.out.println("Aborted!");
                return;
            }
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
