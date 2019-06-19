package threads;

public class Phone {

    public synchronized void call()
    {
        System.out.println(" Calling.... ");
    }

    public
    void sms()
    {
        System.out.println(" Messaging.... ");
    }
}
