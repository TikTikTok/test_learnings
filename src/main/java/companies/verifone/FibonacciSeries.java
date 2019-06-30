package companies.verifone;

public class FibonacciSeries {

    static int n1 = 0, n2 = 1, n3 = 0, count = 10, sum = 0;

    public static void main(String[] args) {

        int first = 0, second = 1;
        System.out.print(" " + n1 + " " + n2);
        int sum = fibonacciWithRecursion(count - 2) + first + second;
        System.out.println();
        System.out.println(" Recur Sum : " + sum);
        System.out.println();
        fibonacciWithoutRecursion();
    }

    public static int fibonacciWithRecursion(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);
            sum = n3 + fibonacciWithRecursion(count - 1);
        }
        return sum;
    }

    public static void fibonacciWithoutRecursion() {

        int n1 = 0, n2 = 1, n3 = 0, count = 10, sum = 0;
        System.out.print(" " + n1 + " " + n2);

        while (count > 2) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            count = count - 1;
            System.out.print(" " + n3);
            sum = sum + n3;
        }
        System.out.println();
        sum = sum + 1;
        System.out.println(" Sum : " + sum);
    }
}
