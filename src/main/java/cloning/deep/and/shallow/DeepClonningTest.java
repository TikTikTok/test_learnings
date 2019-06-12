package cloning.deep.and.shallow;

public class DeepClonningTest {
    public static void main(String[] args) {

        StudentObjectDeepClonningWithAddressReference original = new StudentObjectDeepClonningWithAddressReference();
        original.addName("Chandan Singh");
        original.setStudentAddress("Tavarekere 560029");
        System.out.println(original.displayName());

        System.out.println(" ================================== ");
        StudentObjectDeepClonningWithAddressReference copy = (StudentObjectDeepClonningWithAddressReference)original.clone();
        copy.removePinCode();
        System.out.println(copy.displayAddress());
        System.out.println(" ********************************** ");
        System.out.println(original.displayAddress());




    }
}
