package fourth;

/**
 * Created by Raghu on 15-Jul-17.
 */
public class Fourth {

    public static void foo()
    {
        System.out.println("Inside foo because I am already loaded dude no u r wrong");
    }

    public static void main(String[] args) {
        Fourth f = null;
        f.foo();  // it shd thr NPE right?
        //Compiler change it to -> Fourth.foo(); seee the soourc code
    }
}
