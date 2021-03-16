/**
 * Given an array of positive numbers and a positive number ‘S,’ find the length
 * of the smallest contiguous subarray whose sum is greater than or equal to
 * ‘S’. Return 0 if no such subarray exists.
 * 
 * Input: [2, 1, 5, 2, 8], S=7 Output: 1 The smallest subarray with a sum
 * greater than or equal to '7' is [8].
 */
public class SmallesSubArrayGivenSum {
    public static void main(String args[]) {
        int arr[] = new int[] { 2, 1, 5, 2, 8 };
        int sum = 7;
        int min = findSmallestSubArray(arr, sum);
        System.out.println(min);
    }

    private static int findSmallestSubArray(int[] arr, int target) {
        int windowSum = 0, minLength = 0;
        int windowStart = 0;
        // int arr[] = new int[] { 2, 1, 5, 2, 8 };

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            while (windowSum >= target) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
