package Recurssion;

import java.util.ArrayList;

public class LinearSearch {
    // Finding only first occurance
    static int search(int arr[], int target) {
        return helper(arr, target, 0);
    }

    static int helper(int arr[], int target, int i) {
        if (i == arr.length)
            return -1;
        if (arr[i] == target)
            return i;
        return helper(arr, target, i + 1);
    }

    // Finding all occurances
    static ArrayList<Integer> SearchAllIndices(int arr[], int target) {
        return helper2(arr, target, 0);
    }

    static ArrayList<Integer> helper2(int[] arr, int target, int i) {

        if (i == arr.length) {
            return new ArrayList<>();
        }

        ArrayList<Integer> ans = helper2(arr, target, i + 1);

        if (arr[i] == target) {
            ans.add(0, i); 
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 2, 5, 6, 78, 0 };
        int target = 2;
        System.out.println(search(arr, target));
        System.out.println(SearchAllIndices(arr, target));
    }
}
