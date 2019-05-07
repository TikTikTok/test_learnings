package design_patterns.singleton;

public class LazyInitializationWithDoubleCheckSingletonClass {

    public static LazyInitializationWithDoubleCheckSingletonClass lazyInitializationWithDoubleCheckSingletonClass = null;

    private LazyInitializationWithDoubleCheckSingletonClass() {

    }

    public static LazyInitializationWithDoubleCheckSingletonClass getInstance() {
        if (lazyInitializationWithDoubleCheckSingletonClass == null) {
            synchronized (LazyInitializationWithDoubleCheckSingletonClass.class) {
                if (lazyInitializationWithDoubleCheckSingletonClass == null) {
                    lazyInitializationWithDoubleCheckSingletonClass = new LazyInitializationWithDoubleCheckSingletonClass();
                }
            }
            System.out.println(" Hello ");
        }
        return lazyInitializationWithDoubleCheckSingletonClass;
    }
}
