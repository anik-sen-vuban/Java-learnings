package Test_Code;

class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class ThreadThree extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 3: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class ThreeThreads {
    public static void main(String[] args) {
        // Create three thread objects
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();
        // Start all three threads
        t1.start();
        t2.start();
        t3.start();
    }
}
