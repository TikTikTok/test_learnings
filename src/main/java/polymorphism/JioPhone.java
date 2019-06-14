package polymorphism;


public class JioPhone extends Phone {
    @Override
    public void call() {
        System.out.println(" Jio Phone Call ");
    }

    @Override
    public void sms() {
        System.out.println(" Jio Phone SMS ");
    }

    public void getInternetAccess()
    {
        System.out.println(" Jio Phone Internet ");
    }
}
