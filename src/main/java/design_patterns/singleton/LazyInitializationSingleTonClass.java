package design_patterns.singleton;

public class LazyInitializationSingleTonClass {

    public static LazyInitializationSingleTonClass LAZY_INITIALIZATION_SINGLE_TON_CLASS = null;

    private LazyInitializationSingleTonClass() {

    }

    public static LazyInitializationSingleTonClass getInstance() {
        if (LAZY_INITIALIZATION_SINGLE_TON_CLASS == null) {
            synchronized (LazyInitializationSingleTonClass.class) {
                LAZY_INITIALIZATION_SINGLE_TON_CLASS = new LazyInitializationSingleTonClass();
            }
        }
        return LAZY_INITIALIZATION_SINGLE_TON_CLASS;
    }

}
