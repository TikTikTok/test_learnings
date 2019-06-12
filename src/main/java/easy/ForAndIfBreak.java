package easy;

public class ForAndIfBreak {

    public static void main(String[] args) {

        int  ar[] = {10,50,100,150};

        for (int i = 0; i <ar.length ; i++) {
            if (ar[i] ==100)
            {
                System.out.println(" inside break"+ar[i]);
                break;
            }
            System.out.println("Siva broke "+ar[i]);
        }


    }
}
