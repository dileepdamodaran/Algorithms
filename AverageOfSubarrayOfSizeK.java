/**
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in
 * it. Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 */
public class AverageOfSubarrayOfSizeK {

    public static void main(String args[]) {
        findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
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
