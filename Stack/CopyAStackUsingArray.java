package Stack;

import java.util.Stack;

public class CopyAStackUsingArray {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("The original Stack : "+st);

        int n = st.size();
        int arr[] = new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i] = st.pop();
        }
        Stack<Integer> copy = new Stack<>();
        for(int i=0;i<n;i++){
            copy.push(arr[i]);
        }
        System.out.println("The copied Stack : "+copy);
        
    }
}
