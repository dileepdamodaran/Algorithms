import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKCharacter {

    public static void main(String args[]) {
        System.out.println("LongestSubstringWithKCharacter");
        System.out.println(findLongestSubstringwithK("araaci", 2));
    }

    private static int findLongestSubstringwithK(String input, int k) {
        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charMap = new HashMap();
        for (int windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            char rightChar = input.charAt(windowEnd);
            charMap.put(rightChar, charMap.getOrDefault(rightChar, 0) + 1);
            if (charMap.size() > k) {
                char leftChar = input.charAt(windowStart);
                charMap.put(leftChar, charMap.get(leftChar) - 1);
                if (charMap.get(leftChar) == 0) {
                    charMap.remove(leftChar);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

}
