package serialization.and.deserialization;

import java.io.*;

public class CustomizedSerializationDeserializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        CustomizedTwoTransientSerialization customizedTwoTransientSerialization = new CustomizedTwoTransientSerialization();
        objectOutputStream.writeObject(customizedTwoTransientSerialization);

        System.out.println(" ------------------------------------------- ");

        FileInputStream fileInputStream = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CustomizedTwoTransientSerialization customizedTwoTransientSerialization1 = new CustomizedTwoTransientSerialization();

        System.out.println(" name: " + customizedTwoTransientSerialization1.name + " pin: " + customizedTwoTransientSerialization1.pin + " pwd: " + customizedTwoTransientSerialization1.pwd);


    }
}
