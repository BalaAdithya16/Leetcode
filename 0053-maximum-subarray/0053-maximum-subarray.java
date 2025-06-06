class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0)
                currentSum = nums[i];
            else
                currentSum += nums[i];
            
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}