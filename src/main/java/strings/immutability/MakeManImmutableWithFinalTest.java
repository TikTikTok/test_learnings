package strings.immutability;

public class MakeManImmutableWithFinalTest {

    public static void main(String[] args) {

        ImmutableReference immutableReference = new ImmutableReference("Google");
        MakeManImmutableWithFinal makeManImmutableWithFinal = new MakeManImmutableWithFinal("Chandan",27, immutableReference);
        System.out.println("Name: "+makeManImmutableWithFinal.getName()+" Age: "+makeManImmutableWithFinal.getAge()+" Address "+makeManImmutableWithFinal.getReferenceName());
    }
}
