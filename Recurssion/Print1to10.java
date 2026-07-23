package Recurssion;

// public class Print1to10 {

//     public static void print1(int num, int n) {
//         if (num > n) {
//             return;
//         }

//         System.out.println(num);
//         print1(num + 1, n);
//     }

//     public static void main(String[] args) {
//         print1(1, 5);
//     }
// }

public class Print1to10 {

    public static void print1(int n) {
        if (n == 0) {
            return;
        }
        print1(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print1(5);
    }
}