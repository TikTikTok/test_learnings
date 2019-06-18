package strings.immutability;

public final class ImmutableReference {

    private final String referenceName;

    public ImmutableReference(String referenceName)
    {
        this.referenceName = referenceName;
    }

    public String getReferenceName()
    {
        return referenceName;
    }

}
