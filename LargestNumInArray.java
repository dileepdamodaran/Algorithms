public class LargestNumInArray {

    public static void main(String args[]) {
        int nums[] = new int[] { 1, 2, 45, 67, 88, 90, 3, 123, 4, 2, 9, 8 };
        int max = 0;
        for (int i : nums) {
            max = i > max ? i : max;
        }
        System.out.println(max);
    }
}
