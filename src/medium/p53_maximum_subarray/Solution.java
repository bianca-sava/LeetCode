package medium.p53_maximum_subarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int currMax = nums[0];

        for(int i=1; i<nums.length; i++){
            currMax = Math.max(currMax+nums[i], nums[i]);

            res = Math.max(res,currMax);
        }

        return res;

    }
}
