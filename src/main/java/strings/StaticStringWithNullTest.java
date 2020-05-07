package strings;

public class StaticStringWithNullTest {

    static String str;

    public static void main(String[] args) {

        try {
            String s1 = addString(str);
            System.out.println(s1);
        } catch (NullPointerException np) {
            System.out.println(" Null Pointer EXception " + np.getMessage());
            np.printStackTrace();
        }
    }


    static String addString(String s) {
        return s = s.concat("test");
    }
}
