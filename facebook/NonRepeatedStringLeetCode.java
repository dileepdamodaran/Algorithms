package facebook;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 */
public class NonRepeatedStringLeetCode {

    public static void main(String args[]) {
        String s = "pwwkew"; // dvedf

        int max = 0;
        Map<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            Character c = s.charAt(j);
            if (characterMap.containsKey(c)) {
                i = Math.max(characterMap.get(c), i);
            }
            max = Math.max(max, j - i + 1);
            characterMap.put(c, j + 1);
        }
        System.out.println(max);
    }
}