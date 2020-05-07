package threads;

public class ThreadReasoningTest extends Thread {

    public static void main(String[] args) {

        Thread t1 = new Thread(/*this*/);// ****this*****   can not be used or refrenced from static block
        t1.start();
    }

    public void run() {
        System.out.println("test");
    }
}
