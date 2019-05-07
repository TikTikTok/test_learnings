public class SeriesProgram {
    public static void main(String[] args) {

        SeriesProgram s = new SeriesProgram();
        s.series(0,2,10);
    }

    public void series(int a, int b, int n)
    {
        int base = b, exponent = n;
        int sum = 0;

        int result = 1;

        while (exponent != 0)
        {
            result *= base;
            sum = sum +result;
            System.out.println(sum);
            --exponent;
        }
    }
}
