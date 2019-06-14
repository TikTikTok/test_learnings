package polymorphism;

public class Polymorphism_JioPhoneSamsungPhone_Test {

    public static void main(String[] args) {

        Phone phone = new JioPhone();
        phone.call();
        phone.sms();
        phone.getWhatsAppSMS();
        System.out.println("========================");
        JioPhone jioPhone = (JioPhone)phone;
        jioPhone.call();
        jioPhone.sms();
        jioPhone.getInternetAccess();
    }
}
