package polymorphism;

public class SamsungPhone extends Phone {

    @Override
    public void call() {
        System.out.println(" Samsung Phone Call ");
    }

    @Override
    public void sms() {
        System.out.println(" Samsung Phone SMS ");
    }
}
