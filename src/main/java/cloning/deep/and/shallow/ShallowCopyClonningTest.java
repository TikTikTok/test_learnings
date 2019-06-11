package cloning.deep.and.shallow;

public class ShallowCopyClonningTest {

    public static void main(String[] args) {

        StudentObjectWithoutOtherObjectReference originalObject = new StudentObjectWithoutOtherObjectReference();
        originalObject.addName("Chandan Singh");
        System.out.println(originalObject.displayName());

        StudentObjectWithoutOtherObjectReference shallowClonedObject = (StudentObjectWithoutOtherObjectReference) originalObject.clone();
        shallowClonedObject.removeSurname();
        System.out.println(shallowClonedObject.displayName());
    }
}
