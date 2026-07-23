package Recurssion;

public class SumOfDigits {
    static int digitSum(int n){
        if(n==0) return 0;
        int rem = n%10;
        n /= 10;
        return rem + digitSum(n);
        
    }
    public static void main(String[] args) {
        System.out.println(digitSum(999999999));
    }
}
