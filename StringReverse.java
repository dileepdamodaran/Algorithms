public class StringReverse {

    public static void main(String args[]) {

        String s = "abcde";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
    }
}