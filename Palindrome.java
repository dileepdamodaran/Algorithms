public class Palindrome {

    public static void main(String args[]) {
        String s = "madam";
        if (s.length() != 0) {
            System.out.println(checkPalindrome(s));
        }
    }

    private static boolean checkPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
