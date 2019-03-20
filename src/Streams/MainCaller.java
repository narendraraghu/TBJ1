import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainCaller {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<> ( );

        for (int i = 1; i < 100; i++) {
            values.add (i);
        }

        for (int i : values) {
            //     System.out.println (i );
        }

        // values.forEach (System.out::println);

      //  values.stream ().forEach (System.out::println);  ///we can achive the multiple threads

//        System.out.println (values.stream ().filter (i -> {
//            System.out.println (i );
//            return true;
//        }).findFirst ());
//

        System.out.println (values.stream ().filter (i -> {
            System.out.println (i );
            return true;
        }).count ());

        List<Integer> value =  Arrays.asList (1, 2,43,22,54,64);

        Stream<Integer> s = value.stream ();

        s.forEach (System.out::println);
        s.forEach (System.out::println);   //Exception


    }
}

