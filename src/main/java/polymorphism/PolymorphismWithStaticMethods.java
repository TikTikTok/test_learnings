package polymorphism;

class A
{
    static void hello()
    {
        System.out.println(" Hello A ");
    }
}


class B extends A
{
    static void hello()
    {
        System.out.println(" Hello B ");
    }
}
public class PolymorphismWithStaticMethods {

    public static void main(String[] args) {
        A a = new B();
        A.hello();
        B.hello();
    }
}
