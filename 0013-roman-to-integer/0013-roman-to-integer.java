import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> rooman = new HashMap<>();
        rooman.put('I', 1);
        rooman.put('V', 5);
        rooman.put('X', 10);
        rooman.put('L', 50);
        rooman.put('C', 100);
        rooman.put('D', 500);
        rooman.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length() - 1; i++) {  // Fix index out of bounds
            if (rooman.get(s.charAt(i)) < rooman.get(s.charAt(i + 1))) {
                total -= rooman.get(s.charAt(i));
            } else {
                total += rooman.get(s.charAt(i));
            }
        }

        total += rooman.get(s.charAt(s.length() - 1));  // Add last character's value

        return total;
    }
}
