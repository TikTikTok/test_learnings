package array;

public class ArrayIndexTest {
    public static void main(String[] args) {
        int[] a = new int[200];

        a['a'] = 1;
        a['b'] = 1;
        a['c'] = 1;
        a['d'] = 1;
        a['e'] = 1;
        a['f'] = 1;
        a['g'] = 1;
        a['h'] = 1;
        a['i'] = 1;
        a['j'] = 1;

        //System.out.println(a['a']);

        int a1 = 10;

        Integer i = new Integer(a1);
        Float f = new Float(78.90);

        int b = i.intValue();
        float fv = f.floatValue();

        System.out.println(b);
        System.out.println(fv);

    }
}