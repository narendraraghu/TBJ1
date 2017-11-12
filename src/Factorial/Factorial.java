package Factorial;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));


    }

    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }

}
