package Sorting;
import Sorting.Print;
public class SelectionSortDsa {
    public static void main(String[] args) {
        int arr[] = { 1, 12, 31, 35,0,0,-1, 8, 32, 17 };
        selectionSort(arr);
        Print.print(arr);
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
