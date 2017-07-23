package Third;

/**
 * Created by Raghu on 15-Jul-17.
 */
public class StackOverflowTest {

    public StackOverflowTest() {
        System.out.println("Inside constructor");
    }

   // StackOverflowTest stackOverflowTestAgain = new StackOverflowTest();    It will give  StackOverflowError why becoz of recursive call
    //how to solve it ?

    static StackOverflowTest stackOverflowTest = new StackOverflowTest();

    public static void main(String[] args) {

        System.out.println(" inside main ");
        StackOverflowTest stackOverflowTest = new StackOverflowTest();

    }
}
