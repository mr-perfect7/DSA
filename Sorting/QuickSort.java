package Sorting;
import Sorting.Print;
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {1,5,3,2,8,-1,0,-1,-10,0,0,0,9,4,999999999};
        qSort(arr, 0, arr.length-1);
        Print.print(arr);
    }

    private static void qSort(int[] arr, int start, int end) {
        if(start >= end) return;
        int pvtIdx = partition(arr, start, end);
        qSort(arr, start, pvtIdx-1);
        qSort(arr, pvtIdx+1, end);
    }
    private static int partition(int arr[], int start, int end){
        int idx = start-1, pivot = arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                idx++;
                swap(arr, idx, j);
            }
        }
        idx++;
        swap(arr, end, idx);
        return idx;
    }

    public static int [] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    public static int[] swap(int i, int j){
        return new int []{i,j};
    }
}
