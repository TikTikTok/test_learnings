package generics;

public class MyClass<T, U> {

    T t;
    U u;

    MyClass(T t, U u)
    {
        this.t = t;
        this.u = u;
    }

    public void print()
    {
        System.out.println(t);
        System.out.println(u);
    }
}

class Main
{
    public static void main(String[] args) {
        MyClass<String, Integer> obj = new MyClass<>("Chandan",10);
        obj.print();
    }
}
