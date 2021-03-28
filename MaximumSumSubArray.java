/**
 * Given an array of positive numbers and a positive number ‘k,’ find the
 * maximum sum of any contiguous subarray of size ‘k’.
 */
public class MaximumSumSubArray {

    private static int findMaxSumSubArray;

    public static void main(String args[]) {
        int[] arr = new int[] { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        int max = findMaxSumSubArray(arr, k);
        System.out.println(max);
    }

    public static int findMaxSumSubArray(int[] arr, int k) {
        int[] subArr = new int[] {};
        int windowSum = 0;
        int windowStart = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
