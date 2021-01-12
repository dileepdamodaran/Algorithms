class MoveZeroToEnd {
    public static void main(String args[]) {
        int nums[] = { 0, 1, 0, 3, 12 };

        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        for (int lastNonZero = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[lastNonZero];
                nums[lastNonZero++] = nums[cur];
                nums[cur] = temp;
            }
        }
        System.out.println(nums);
    }
}