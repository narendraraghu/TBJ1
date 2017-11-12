public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
        fibonacci(10);


    }
    public static void fibonacci(int number) {
        int fibo1 = 1;
        int fibo2 = 1;

        System.out.printf("%nFibonacci series of %d numbers are : ", number);
        System.out.printf("%s ", fibo1);
        System.out.printf("%s ", fibo2);

        for (int i = 2; i <number; i++) {
            int fibonacci = fibo1 + fibo2;
            System.out.printf("%s ", fibonacci);
            fibo2 = fibo1;
            fibo1 = fibonacci;
        }
    }
}
