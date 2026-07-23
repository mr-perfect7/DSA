package Recurssion;

import java.util.Scanner;

public class SumOfNumbers {
    static int sumN(int n){
        if(n==0){
            return 0;
        }
        return n + sumN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(sumN(n));
    }
}
