package Nine;

/**
 * Created by Raghu on 22-Jul-17.
 */
public class Nine {
    public static void main(String[] args) {
        System.out.println(Double.MIN_VALUE);//The Double.MIN_VALUE is 2^(-1074), a double constant whose magnitude is the least among all double values.
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

        /*you can not override a private or static method in Java, if you create a similar method with same return type and same method arguments in child class then it will hide the superclass method, this is known as method hiding.*/


    }
}
