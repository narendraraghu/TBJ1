package Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Raghu on 23-Jul-17.
 */
public class Lambda {


    public static void hiIteratot()
    {
        String str ="narendra"+"raghuwanshi";
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for (int i = 0; i <integerList.size() ; i++) {
            System.out.println(integerList.get(i));

        }
        for (int e:integerList ) {
            System.out.println(e);

        }
        integerList.forEach((Integer value)->  System.out.println(value));

        integerList.forEach((value)->  System.out.println(value)); //intelligeny java

        integerList.forEach(value->  System.out.println(value));  //For single parameter () not required

        integerList.forEach(System.out::println);

        integerList.stream().filter(e->e%2==0).mapToInt(e->e*2).sum();

        integerList.stream().filter(e->e%2==0).mapToInt(e->e*2).sum();
    }

    public static void main(String[] args) {
/*        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Run");
            }
        });*/

        Thread thread = new Thread(()->  System.out.println("Inside Run"));
        thread.start();
        hiIteratot();

    }


}
