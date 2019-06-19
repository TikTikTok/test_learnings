package strings.immutability;

public final class MakeManImmutableWithFinal {

    private final String name;
    private final int age;
    private final ImmutableReference ref;

    public MakeManImmutableWithFinal(String name, int age, ImmutableReference ref) {
        this.name = name;
        this.age = age;
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getReferenceName()
    {
        return ref.getReferenceName();
    }

}
