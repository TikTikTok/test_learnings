package strings.immutability;

public final class MakeManImmutableWithFinal {

    private final String name;
    private final int age;

    public MakeManImmutableWithFinal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
