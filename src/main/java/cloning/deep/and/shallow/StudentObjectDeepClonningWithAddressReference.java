package cloning.deep.and.shallow;

public class StudentObjectDeepClonningWithAddressReference implements Cloneable {

    String name;
    StudentAddress studentAddress = new StudentAddress();

    public void addName(String name)
    {
        this.name = name;
    }

    public String displayName()
    {
        return name;
    }

    public void removeSurname()
    {
        this.name = this.name.substring(0,8);
    }

    public void setStudentAddress(String address)
    {
        studentAddress.addAddress(address);
    }

    public void removePinCode()
    {
        studentAddress.discardPincode();
    }

    public String displayAddress()
    {
        return studentAddress.displayAddress();
    }

    public Object clone()
    {
        StudentObjectDeepClonningWithAddressReference clonningObject = null;
        try {
             clonningObject = (StudentObjectDeepClonningWithAddressReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.getMessage());
        }
        clonningObject.studentAddress = (StudentAddress)studentAddress.clone();
        return clonningObject;
    }
}
