package Six;

/**
 * Created by Raghu on 15-Jul-17.
 */
public class Six {
    public static void main(String[] args) {
        Long aLongValue = new Long(0);
        System.out.println(aLongValue.equals(0)); //Will it return true ooooo  noo see the implementation of Long class ewuals method

        ///So what to do How to Fix that hmm?

        System.out.println(aLongValue.equals(0L));

        //Same things happened with double and Float values
    }
}

/* Long equals implementation
    public boolean equals(Object obj) {
        if (obj instanceof Long) {
            return value == ((Long)obj).longValue();
        }
        return false;
    }*/


