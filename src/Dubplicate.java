import java.util.HashSet;
import java.util.Set;

/**
 * Created by Raghu on 28-Aug-17.
 */
public class Dubplicate {
    public static void main(String[] args) {
        int myArray[] = new int[]{1, 2, 3, 4, 5};
        checkFotDuplicate(myArray);
    }

    private static void checkFotDuplicate(int[] myArray) {
        Set<Integer> mySet = new HashSet<>();
        for (Integer x : myArray) {

            if (mySet.add(x) == false)
                System.out.println("Duplicate presnt in the array");
        }
    }
}
