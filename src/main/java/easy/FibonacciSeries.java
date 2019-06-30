package easy;

public class FibonacciSeries {

    static int result = 0;

    public static void main(String[] args) {

        int counter = 9;
        int value = FibonacciSeries.fibonacciSeries(counter);
        System.out.println(value);


    }

    public static int fibonacciSeries(int counter) {
       if (counter<1)
       {
           return counter;
       }else {
           return fibonacciSeries(counter-1) + fibonacciSeries(counter-2);
       }
    }
}
