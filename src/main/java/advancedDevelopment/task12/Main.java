package advancedDevelopment.task12;

/**
 * Create a class implementing the Runnable interface, e.g. MyRunnable.
 * Implement the run() method, which will display the name of the current thread similarly to the previous exercise.
 * Create a class with a public static void main(String[] args) method.
 * Inside the main method, create a variable of the type of the class created above, e.g. MyRunnable, and initialize the class.
 * Create a variable of type Thread and initialize it by passing the implementation of the Runnable interface as a parameter to the constructor.
 * Call the start() method on the Thread variable.
 */
public class Main {
    public static void main(String[] args) {
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread thread = new Thread(myRunnable1);
        thread.start();
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
