package threads;

public class MyThreadJoinMethodTest extends Thread {

    public void run() {
        for (int i = 1; i < 3; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i);
        }
    }

    public static void main(String[] args) {

        MyThreadJoinMethodTest t1 = new MyThreadJoinMethodTest();
        MyThreadJoinMethodTest t2 = new MyThreadJoinMethodTest();
        MyThreadJoinMethodTest t3 = new MyThreadJoinMethodTest();
        t1.start();

        try {
            t1.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
