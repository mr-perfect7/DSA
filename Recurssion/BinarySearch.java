package Recurssion;

public class BinarySearch {
    static int search(int arr[], int target, int st, int end){
        if(st>end){
            return -1;
        }
        int mid = st+(end-st)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return search(arr, target, st, mid-1);
        }else{
            return search(arr, target, mid+1, end);
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,67,77,78,90};
        int target = 9;
        System.out.println(search(arr,target,0,arr.length-1));
    }
}
