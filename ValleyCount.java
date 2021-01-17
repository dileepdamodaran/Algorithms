/**
 * HackerRank
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class ValleyCount {

    public static void main(String args[]) {
        int level = 0;
        String path = "UDDDUDUU";
        int valleys = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'D') {
                if (level == 0) {
                    valleys++;
                }
                level--;
            } else if (path.charAt(i) == 'U') {
                level++;
            }

        }
        System.out.println(valleys);
    }
}
