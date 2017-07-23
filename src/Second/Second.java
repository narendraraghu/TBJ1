package Second;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Raghu on 15-Jul-17.
 */
public class Second {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormatInput = new SimpleDateFormat("dd/MM/yyyy G");

        Date date = simpleDateFormatInput.parse("30/01/2017 AD");
        System.out.println(date);       //gOOd :P

        Date date1 = simpleDateFormatInput.parse("33/01/2017 AD");
        System.out.println(date1);     ///oho its changed the month


        Date date2 = simpleDateFormatInput.parse("33/-1/2017 AD");
        System.out.println(date2);     ///oho its changed the month ting tong

        //same thing happens with month and year as well



    }
}
