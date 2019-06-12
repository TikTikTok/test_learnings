package serialization.and.deserialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedTwoTransientSerialization implements Serializable {

    String name = "Chandan";
    transient String pin = "123";
    transient String pwd = "234";

    private void writebject(ObjectOutputStream objectOutputStream) throws Exception {
        objectOutputStream.defaultWriteObject();
        pin = "12345" + pin;
        pwd = "12345" + pwd;
        //objectOutputStream.writeObject(name);
        objectOutputStream.writeObject(pin);
        objectOutputStream.writeObject(pwd);
    }

    private void readObject(ObjectInputStream objectInputStream) throws Exception {
        objectInputStream.defaultReadObject();
        //name = (String)objectInputStream.readObject();
        pin = (String) objectInputStream.readObject();
        pin = pin.substring(5);
        pwd = (String) objectInputStream.readObject();
        pwd = pwd.substring(5);
    }

}
