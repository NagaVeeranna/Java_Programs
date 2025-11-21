class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting.");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}
public class IsliveAndJoin {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        System.out.println("Starting threads...");
        thread1.start();
        thread2.start();
        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());
        try {
            thread1.join();
            System.out.println("Thread 1 has completed execution.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        try {
            thread2.join();
            System.out.println("Thread 2 has completed execution.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread 2 is alive: " + thread2.isAlive());
        System.out.println("All threads have completed.");
    }
}
