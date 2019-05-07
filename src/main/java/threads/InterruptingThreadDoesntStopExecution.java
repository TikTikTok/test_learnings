package threads;

public class InterruptingThreadDoesntStopExecution implements Runnable {

    public static void main(String[] args) {

        InterruptingThreadDoesntStopExecution interruptingThreadDoesntStopExecution = new InterruptingThreadDoesntStopExecution();

        Thread thread = new Thread(interruptingThreadDoesntStopExecution);
        thread.start();
        thread.interrupt();
        System.out.println(" Main thread completes ");

    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(" Thread started " + i);

                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException occur");
        }
    }
}

