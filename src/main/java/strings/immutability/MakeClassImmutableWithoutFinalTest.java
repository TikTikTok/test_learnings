package strings.immutability;

public class MakeClassImmutableWithoutFinalTest {

    public static void main(String[] args) {
        MakeClassImmutableWithoutFinal obj = new MakeClassImmutableWithoutFinal(5);
        System.out.println(obj.getInstanceValue());
    }
}
