package first;

public class Main {

    public static void main(String[] args) {
        System.out.println(first.First.x);
        //compiler load at runtime only x value from first clss and put it here value 100 so static block is not getting executed
    }
}
