public class ConsecutiveNumSum {

    public static void main(String args[]) {
        consecutiveSum(5);
    }

    private static void consecutiveSum(int n) {
        int sum = (n * (n + 1)) / 2;
        /*
         * for (int j = 1; j <= i; j++) { sum += j; }
         */
        System.out.println(sum);

    }

}
