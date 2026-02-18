package medium.p918_maximum_sum_circular;

public class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0];
        int currMax = nums[0];
        int min=nums[0];
        int currMin = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            currMax = Math.max(currMax+nums[i], nums[i]);
            max = Math.max(currMax, max);

            currMin = Math.min(currMin+nums[i], nums[i]);
            min = Math.min(currMin, min);

            sum += nums[i];
        }

        return max > 0 ? Math.max(max, sum - min) : max;
    }
}
