package JAVA_8_Features.lamda_expressions;

import java.util.Arrays;
import java.util.List;

public class LamdaWithConditions {

    public static void main(String[] args) {


      /* List<Person> persons = getPeople();

        LamdaBuz con= new LamdaBuz();
        con.getPeople();

      List<Person> filter1 = persons.stream().filter((p)-> "jack".equals(p.getName()) && 20 == p.getAge()).collect(Collectors.toList());


      //LamdaWithConditions  lamdaWithConditions = LamdaWithConditions::new;

        Runnable runnable = Thread::new;*/



    }


}


class LamdaBuz {

    public  List<Person> getPeople() {
        return Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)

             );

}
}