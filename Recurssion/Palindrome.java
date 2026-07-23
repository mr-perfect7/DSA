package Recurssion;

public class Palindrome {
    static int rev = 0;
    public static int reverse(int n){
        if(n==0) return rev;
        rev = rev * 10 + n%10;
        return reverse(n/10);
    }
    public static boolean palen(int n){
        return n == reverse(n);
    }
    public static void main(String[] args) {
        System.out.println(palen(1234321));
    }
}
