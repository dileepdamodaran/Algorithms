public class ConsecutiveNumSum {

    public static void main(String args[]) {
        consecutiveSum(5);
    }

    private static void consecutiveSum(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        System.out.println(sum);
    }

}
