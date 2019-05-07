package design_patterns.singleton;

public class EagerInitializationSingletonClass {

    public static final EagerInitializationSingletonClass eagerInitializationSingletonClass = new EagerInitializationSingletonClass();

    private EagerInitializationSingletonClass() {

    }

    public static EagerInitializationSingletonClass getInstance() {
        return eagerInitializationSingletonClass;
    }

}
