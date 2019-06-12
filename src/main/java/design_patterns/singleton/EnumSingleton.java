package design_patterns.singleton;

public class EnumSingleton {

    public static void main(String[] args) {
        System.out.println(" Hello Love ");
        EnumSingletonTest enumSingletonTest = EnumSingletonTest.INSTANCE;
        enumSingletonTest.showSingletonMessage();
    }
}

enum  EnumSingletonTest
{
    INSTANCE;

    public void showSingletonMessage()
    {
        System.out.println(" Enum Singleton ");
    }
}
