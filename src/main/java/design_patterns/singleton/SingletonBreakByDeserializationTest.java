package design_patterns.singleton;

import java.io.*;

class SingletonBreakByDeserialization implements Serializable {

    public static SingletonBreakByDeserialization singletonBreakByDeserialization = new SingletonBreakByDeserialization();

    private SingletonBreakByDeserialization() {

    }

    // if we remove the below method, singleton breaks
    protected Object readResolve()
    {
        return singletonBreakByDeserialization;
    }
}

public class SingletonBreakByDeserializationTest implements Serializable {

    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(SingletonBreakByDeserialization.singletonBreakByDeserialization);
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("text.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SingletonBreakByDeserialization singletonBreakByDeserialization2 = (SingletonBreakByDeserialization) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(" SingleTonObject "+SingletonBreakByDeserialization.singletonBreakByDeserialization.hashCode());
            System.out.println(" DeserializedObject "+ singletonBreakByDeserialization2.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


