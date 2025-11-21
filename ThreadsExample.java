class CustomThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread extending Thread class: Good Morning");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class RunnableTask implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Runnable interface: Hello");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadsExample {
    public static void main(String[] args) {
        CustomThread thread1 = new CustomThread();
        Thread thread2 = new Thread(new RunnableTask());

        thread1.start();
        thread2.start();
        while (true) {
            System.out.println("Main thread: Welcome");
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
