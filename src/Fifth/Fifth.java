package Fifth;

/**
 * Created by Raghu on 15-Jul-17.
 */
public class Fifth {
    public static void main(String[] args) {
       // String string = new String(null);       //Ambiguous error becoz more constructor is thr
        Integer integer = new Integer(null);  //Only one costructor in Integer classs

      //  System.out.println("String" + string);
        System.out.println("Integet" + integer);

        System.out.println(integer.intValue()); //java.lang.NumberFormatException: null
    }

}

