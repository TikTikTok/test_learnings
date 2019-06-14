package strings.immutability;

public class MakeClassImmutableWithoutFinal {

    int i;

    public MakeClassImmutableWithoutFinal(int i)
    {
        this.i = i;
    }

    public static MakeClassImmutableWithoutFinal create(int i)
    {
        return new MakeClassImmutableWithoutFinal(i);
    }

    public int getInstanceValue()
    {
        return i;
    }
}
