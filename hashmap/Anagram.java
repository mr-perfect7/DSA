import java.util.HashMap;

public class Anagram{
    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                int currFreq = map.get(ch);
                map.put(ch, currFreq+1);
            }
        }
        return map;
    }
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = makeFreqMap(s);
        HashMap<Character,Integer> map2 = makeFreqMap(t);
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("sasank", "kassan"));
    }
}