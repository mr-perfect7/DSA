package Stack;

import java.util.Stack;
import java.util.Scanner;
public class InsertAnElementAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("The original Stack : "+st);

        Stack<Integer> temp = new Stack<>();
        while (st.size()>0) {
            temp.push(st.pop());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index where you want to insert: ");
        int idx = sc.nextInt();
        System.out.println("Enter the number you want to insert: ");
        int n = sc.nextInt();
        if(idx == 0){
            st.push(n);
        }
        while (temp.size()>0) {
            if(st.size()==idx){
                st.push(n);
            }
            st.push(temp.pop());
        }
        System.out.println("New Stack is : "+st);
    }
}
