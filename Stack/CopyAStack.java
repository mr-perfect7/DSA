package Stack;

import java.util.Stack;

public class CopyAStack {
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

        Stack<Integer> copy = new Stack<>();
        while (temp.size()>0) {
            copy.push(temp.pop());
        }
        System.out.println("The copied Stack : "+copy);
        
    }
}
