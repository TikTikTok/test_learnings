package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamWithSimilarType {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(new Integer[]{1,2,3,4,5});

        // Stream doesn't support autoboxing. this will throw compile time error
        // Stream<Integer> integerStream1 = Stream.of(new int[]{1,2,3,4,5});

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) integerArrayList.add(i);

        System.out.println(" Hello Git  ");


    }
}
