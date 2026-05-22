package Sorting;

import Sorting.Print;

public class MergeSortDsa {
    public static void main(String[] args) {
        int arr[] = { 12, 31, 35,0,0,-1, 8, 32, 17 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        Print.print(arr);
    }
    private static void mergeSort(int arr[], int start, int end){
        if(start>=end) return;
        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    private static void merge(int arr[], int start, int mid, int end){
        int merged[] = new int [end - start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x =0;
        while(idx1<=mid && idx2<=end){
            merged[x++] = (arr[idx1] <= arr[idx2] ? arr[idx1++] : arr[idx2++]);
        }
        // while (idx1<=mid && idx2<=end) {
        //     if(arr[idx1]<=arr[idx2]){
        //         merged[x++] = arr[idx1++];
        //     }else{
        //         merged[x++] = arr[idx2++];
        //     }
        // }
        while (idx1<=mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2<=end) {
            merged[x++] = arr[idx2++];
        }
        for(int i=0, j = start;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
}