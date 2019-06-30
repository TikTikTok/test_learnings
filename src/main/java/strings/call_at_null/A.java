package strings.call_at_null;

public class A {

    public void callAtNullObject(String str)
    {
        System.out.println(" String argument ");
    }

    public void callAtNullObject(Object obj)
    {
        System.out.println(" Object argument ");
    }

    public void callAtNullObject(A a)
    {
        System.out.println("A a Object argument ");
    }
}
