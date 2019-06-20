package exception.best_practice;

import java.io.IOException;

public class RuntimeIOAndErrorTest {

    public static void main(String[] args) {

        try {
            RuntimeIOAndErrorTest.testException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }/*catch (IOException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }*/
    }

    public static void testException() throws IOException {

        if (1 > 0) {
            throw new RuntimeException(" Rumtime ");
        }

        if (1 < 1) {
            throw new IOException("IO Exception ");
        }

        if (2 == 1) {
            throw new OutOfMemoryError("error");
        }
    }
}
