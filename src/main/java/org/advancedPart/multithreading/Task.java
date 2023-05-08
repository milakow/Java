package org.advancedPart.multithreading;

/**
 * 33. Create a new thread in main in two different ways.
 * By declaring a Task class that implements the Runnable interface
 * and using an anonymous class that implements Runnable.
 * Both threads are supposed to print 10_000 times any text
 * and the number of the current iteration (variable and from the loop).
 */
public class Task  {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println(i + " text from implemented RUNNABLE task2");
                }
            }
        };
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

    }
}

class Task1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + " text from implemented interface task1");
        }
    }
}
