package Recurssion;

public class CountZeros {

    static int counter(int n) {
        if (n == 0) return 0;
        int count = 0;
        if (n % 10 == 0) count = 1;
        return count + counter(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(counter(10000000));
    }
}