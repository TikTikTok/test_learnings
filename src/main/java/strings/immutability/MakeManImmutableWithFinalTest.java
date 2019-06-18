package strings.immutability;

import cloning.deep.and.shallow.StudentAddress;

public class MakeManImmutableWithFinalTest {

    public static void main(String[] args) {

        MakeManImmutableWithFinal makeManImmutableWithFinal = new MakeManImmutableWithFinal("Chandan",27, new ImmutableReference("Bangalore"));

        System.out.println("Name: "+makeManImmutableWithFinal.getName()+" Age: "+makeManImmutableWithFinal.getAge()+" Address "+makeManImmutableWithFinal.getStudentAddress().displayAddress());
        ImmutableReference immutableReference = new ImmutableReference("Google");
        System.out.println("Name: "+makeManImmutableWithFinal.getName()+" Age: "+makeManImmutableWithFinal.getAge()+" Address "+makeManImmutableWithFinal.getStudentAddress().displayAddress());
    }
}
