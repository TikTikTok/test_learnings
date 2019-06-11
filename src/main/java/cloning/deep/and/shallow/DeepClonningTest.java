package cloning.deep.and.shallow;

public class DeepClonningTest {
    public static void main(String[] args) {

        StudentObjectDeepClonningWithAddressReference original = new StudentObjectDeepClonningWithAddressReference();
        original.addName("Chandan Singh");
        System.out.println(original.displayName());

        StudentObjectDeepClonningWithAddressReference copy = new StudentObjectDeepClonningWithAddressReference();



    }
}
