package Seven;

/**
 * Created by Raghu on 16-Jul-17.
 */
//How to hide members in subclass ?
class Parent {
    public String name = "Narendra";
}

class Child extends Parent {
    private String name = "Narendra";
}

public class Seven {
    public static void main(String[] args) {
        System.out.println(new Parent().name);
        //  System.out.println(new Child().name);

    }
    // why is the error here Becoz of member hiding of super class  in subclass rename the subclasss variable name then no error
}
