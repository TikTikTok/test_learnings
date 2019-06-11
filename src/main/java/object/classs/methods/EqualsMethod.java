package object.classs.methods;

public class EqualsMethod {

    private String systemName;
    private int systemId;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public int getSystemId() {
        return systemId;
    }

    public void setSystemId(int systemId) {
        this.systemId = systemId;
    }

    @Override
    public int hashCode()
    {
        final int add_value = 10;
        int result = add_value + getSystemId();
        System.out.println(result);
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null && !(obj instanceof EqualsMethod) && obj.getClass() != this.getClass()) {
            return false;
        }

        EqualsMethod equalsMethod = (EqualsMethod) obj;

        if (equalsMethod.getSystemId() == this.getSystemId() && equalsMethod.getSystemName().equals(((EqualsMethod) obj).getSystemName())) {
            return true;
        }

        return false;
    }
}
