package imports;

import static imports.StaticImport.*;
import static java.lang.Math.*;

public class StaticImportTest {

    public static void main(String[] args) {

        System.out.println(NAME);
        System.out.println(ADDRESS);
        System.out.println(EXPERIENCE);
        System.out.println(sqrt(4));
        System.out.println(pow(4,5));
        System.out.println(abs(8.3));
        System.out.println(abs(8.5));
        System.out.println(abs(8.7));
    }
}
