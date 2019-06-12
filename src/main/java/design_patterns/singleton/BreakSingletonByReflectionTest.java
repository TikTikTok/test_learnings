package design_patterns.singleton;


import java.lang.reflect.Constructor;

class BreakSingletonByReflection
{
    public static BreakSingletonByReflection breakSingletonByReflection = new BreakSingletonByReflection();

    private BreakSingletonByReflection(){

    }
}

public class BreakSingletonByReflectionTest {

    public static void main(String[] args) {

        BreakSingletonByReflection breakSingletonByReflection1 = BreakSingletonByReflection.breakSingletonByReflection;

        BreakSingletonByReflection breakSingletonByReflection2 = null;

        try {
            Constructor[] constructors = BreakSingletonByReflection.class.getDeclaredConstructors();

            for (Constructor constructor: constructors) {
                constructor.setAccessible(true);
                breakSingletonByReflection2 = (BreakSingletonByReflection) constructor.newInstance();
                break;
            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        System.out.println("breakSingletonByReflection1.hashCode():- "
                + breakSingletonByReflection1.hashCode());
        System.out.println("breakSingletonByReflection12.hashCode():- "
                + breakSingletonByReflection2.hashCode());
    }
}
