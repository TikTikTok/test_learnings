package strings.call_at_null;

public class A_Test {

    public static void main(String[] args) {
        A a = new A();
        a.callAtNullObject(new String("hi"));
        a.callAtNullObject(new Object());
        a.callAtNullObject(a);
    }
}
