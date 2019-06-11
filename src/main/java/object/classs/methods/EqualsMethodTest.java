package object.classs.methods;

public class EqualsMethodTest {

    public static void main(String[] args) {

        EqualsMethod equalsMethod1 = new EqualsMethod();
        equalsMethod1.setSystemId(10);
        equalsMethod1.setSystemName("Chandan");

        EqualsMethod equalsMethod2 = new EqualsMethod();
        equalsMethod2.setSystemId(10);
        equalsMethod2.setSystemName("Chandan");

        System.out.println(equalsMethod1.equals(equalsMethod1));
        System.out.println(equalsMethod1.hashCode() +" "+equalsMethod2.hashCode());
    }
}
