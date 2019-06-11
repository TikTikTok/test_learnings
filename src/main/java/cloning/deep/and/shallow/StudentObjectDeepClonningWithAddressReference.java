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

    public Object clone()
    {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.getMessage());
        }
    }
}
