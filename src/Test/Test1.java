package Test;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(isPrime(7));


    }

    public static boolean isPrime(int number){
        if(number%2==0){
            return false;
        }
        for(int i=3;i<number;i=i+2){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

}
