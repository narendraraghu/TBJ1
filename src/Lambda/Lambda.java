package Lambda;

/**
 * Created by Raghu on 23-Jul-17.
 */
public class Lambda {

    public static void main(String[] args) {
/*        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Run");
            }
        });*/

        Thread thread = new Thread(()->  System.out.println("Inside Run"));
        thread.start();
    }
}
