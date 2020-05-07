package exception;

public class TestingExceptionWithFinally {

    public static void doSomething() throws Exception {

        try {
            throw new Exception();
        } finally {
            System.out.println(" Inside finally ");
        }
    }

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            System.out.println(" Inside Catch ");
        }finally {
            System.out.println(" Inside Main Finally ");
        }

        System.out.println(" Outside ");
    }
}
