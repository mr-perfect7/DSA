package Recurssion;

public class SortedOrNot {
    public static boolean checkRec(int arr[],int i){
        if(i==arr.length-1) return true;
        if(arr[i]<arr[i+1])
        return checkRec(arr, i+1);
    return false;
    }
    public static boolean checkIte(int arr[]){
        boolean flag = false;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                flag = true;
            }else{
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,30,440,51,80};
        System.out.println(checkIte(arr));
    }
}
