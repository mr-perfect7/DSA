package Recurssion;

public class ProdOfdigits {
    static int prod(int n){
        if(n<=1){
            return n;
        }
        return n%10 * prod(n/10);
    }
    public static void main(String[] args) {
        System.out.println(prod(1234));
    }
}
