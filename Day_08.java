// Given an integer array of nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
// nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
// Maximum sum of contiguous subarray: 6

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int ans = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            ans = Math.max(ans, sum);
        }
        
        return ans;
    }
}
