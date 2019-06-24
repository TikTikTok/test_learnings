package JAVA_8_Features.functional_interface;

public class FunctionalInterfaceTest_1 {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(" Functional Interface Test- 1");
            }
            System.out.println(Thread.currentThread().getName());
        };
        new Thread(runnable).start();
    }
}
