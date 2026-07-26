package Recurssion;

public class BubbleSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] bubble(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        bubble(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " | ");
        }
    }
}