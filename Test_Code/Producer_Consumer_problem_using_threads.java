package Test_Code;

class Producer extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(1000); // 1 second wait
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1500); // 1.5 second wait
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Consumed: " + i);
        }
    }
}



public class Producer_Consumer_problem_using_threads {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
//        producer.run();
//        consumer.run();
        producer.start();
        consumer.start();
    }
}
