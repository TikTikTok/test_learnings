package threads;


class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(" Run in MyThread ");
    }

    @Override
    public void start() {
        System.out.println(" Start in MyThread ");
    }

}


public class MyThreadTest {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.run();// it will always run method of MyThread class... because you are calling direct run method instead of start.
        t1.start();// since you have overriding start method in MyThread, it will pick MyThread start method and execute
    }
}
