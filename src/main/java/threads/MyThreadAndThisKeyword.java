package threads;

public class MyThreadAndThisKeyword extends Thread {

    public void run()
    {
        method();
    }

    public void method()
    {
        synchronized (this)
        {
            System.out.println(" My Class ");
        }
    }
    public static void main(String[] args) {

        /*MyThreadAndThisKeyword t1 = new MyThreadAndThisKeyword();
        t1.start();*/

        new Thread(new MyThreadAndThisKeyword()).start();
    }
}
