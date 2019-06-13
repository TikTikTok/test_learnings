package properties_file_store_load;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertyFileStoreAndLoad {

    public static void main(String[] args) {
        try {

            // create properties file
            FileOutputStream fileOutputStream = new FileOutputStream("properties.properties");

            //create property object and populate them with key and value
            Properties properties = new Properties();
            properties.setProperty("first_name","Chandan");
            properties.setProperty("last_name", "Singh");
            properties.setProperty("address", "Bangalore");

            //Store the key and value pair to the file
            properties.store(fileOutputStream, "My Details");

            //getting the file with name properties.properties
            InputStream inputStream = new FileInputStream("properties.properties");

            if (null == inputStream)
            {
                throw new FileNotFoundException(" File "+properties+" not found in the class path ");
            }

            //populating the properties(key and value pair) object to properties object
            properties.load(inputStream);

            //iterating with java 8 for each
            properties.forEach((key, value) -> System.out.println(" Key : "+key+" Value: "+value));

            // Storing properties file keys into Set
            Set<Object> keys = properties.keySet();

            //iterating Set with java 8 for each
            keys.forEach(x -> System.out.println(" Keys: "+x+" value: "+properties.getProperty((String)x)));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
