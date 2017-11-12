package Pelindrom;

public class Pelindrom {
    public static void main(String[] args) {
    isPelindrom("nitin");
        System.out.println(isNumbebrpalindrom(10011));


    }

    public static void isPelindrom(String str) {
        int length = str.length();
        String rev = "";

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");

    }
    private static boolean isNumbebrpalindrom(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

}
