import java.util.Arrays;

/**
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in
 * it. Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 */
public class AverageOfSubarrayOfSizeK {

    public static void main(String args[]) {
        // findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        findAveragesBeta(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });

    }

    private static void findAveragesBeta(int i, int[] js) {
        int windowStart = 0;
        double sum = 0;
        double resultArr[] = new double[js.length - i + 1];
        for (int windowEnd = 0; windowEnd < js.length; windowEnd++) {
            sum += js[windowEnd];
            if (windowEnd >= i - 1) {
                resultArr[windowStart] = sum / i;
                sum = sum - js[windowStart];

                windowStart++;
            }
        }
        System.out.println(Arrays.toString(resultArr));
    }

    public static double[] findAverages(int k, int arr[]) {
        int windowStart = 0;
        double[] result = new double[arr.length - k + 1];
        double sum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                result[windowStart] = sum / k;
                sum = sum - arr[windowStart];
                System.out.println(result[windowStart]);
                windowStart++;

            }
        }
        return result;
    }
}
