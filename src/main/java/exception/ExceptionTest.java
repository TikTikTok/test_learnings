package exception;

public class ExceptionTest {

    public static void main(String[] args) {

        int value = ExceptionTest.returnValue();
        System.out.println(value);
    }

    public static int returnValue()
    {
        int a = 10;
        int b = 0;

        if (a!= 20)
        {
            try {
                int c = a/0;
                System.out.println(" Try block ");
                return 1;
               // throw new CustomException(" parameter value a didn't match ");
            } catch (ArithmeticException e) {
                System.out.println(" Catch block ");
                e.printStackTrace();
                return 2;
            }finally {
                System.exit(0);
                System.out.println(" Finally block ");
                return 3;
            }
        }
        return 4;
    }
}
