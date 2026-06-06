package Recurssion;

public class Fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static int fibSeries(int n){
        if(n==0 || n==1) System.out.println(n);
        return fibo(n-1) + fibo(n-2);
    }
    public static void printSeries(int n){
        for(int i=0;i<=n;i++){
            System.out.println(fibo(i));
        }
    }
    public static void main(String[] args) {
        // System.out.println(fibo(5));
        printSeries(5);
    }
}
