import java.util.HashMap;
public class solution {
    class Solution {
        public boolean isAnagram(String s, String t) {
            int length = s.length();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < length; i++) {
                if (map.containsKey(s.charAt(i))) {
                    Integer value = map.get(s.charAt(i));
                    map.put(s.charAt(i), value + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }
            length = t.length();
            for (int i = 0; i < length; i++) {
                if (map.containsKey(t.charAt(i))) {
                    Integer value = map.get(t.charAt(i));
                    map.put(t.charAt(i), value - 1);
                } else {
                    return false;
                }
            }
            for (int val : map.values()) {
                if (val != 0) {
                    return false;
                }
            }
    
            return true;
    
        }
    }
    
    
}
