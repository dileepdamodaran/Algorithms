/*
https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
*/
public class RepeatedCharacterCount {

    public static void main(String args[]) {
        String s = "abca";
        long rep = 10;
        long repCount = 0;
        long div = rep / s.length();
        long rem = rep % s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                repCount++;

        }

        repCount = repCount * div;

        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a')
                repCount++;
        }

        System.out.println(repCount);

    }
}
