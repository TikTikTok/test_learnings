package cloning.deep.and.shallow;

public class StudentAddress implements Cloneable {

    public String address;

    public void addAddress(String address)
    {
        this.address = address;
    }

    public void discardPincode()
    {
        this.address = address.substring(0, 10);
    }

    public String displayAddress()
    {
        return address;
    }

    public Object clone()
    {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError(" Clone Not supported ");
        }
    }
}
