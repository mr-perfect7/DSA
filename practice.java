import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class NumComp implements Comparator<Integer>{
    
    public int compare(Integer a, Integer b){
            return a-b;
    }
}
public class practice {
    static class MyComparator implements Comparator<String>{
        public int compare(String x, String y){
            return y.length()-x.length();
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sasankmm");
        list.add("basank");
        list.add("king");
        list.add("aviadadadadaad");
        System.out.println(list);
        list.sort(new MyComparator());
        System.out.println(list);

        // List<Integer> num1 = new ArrayList<>(Arrays.asList(5,4,3,2,6,7));
        // num1.sort(new NumComp());
        // System.out.println(num1);
    }
}
