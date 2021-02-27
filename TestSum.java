class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int lookup = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (lookup == nums[j])
                    return new int[] { i, j };
            }
        }
        return null;
    }
}