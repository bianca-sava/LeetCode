package medium.p11_container_with_most_water;

public class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length -1;
        int maxVol = 0;
        int currVol =0;

        while(left<right){
            currVol = Math.min(height[left], height[right])*(right-left);
            maxVol = Math.max(maxVol,currVol);
            if(height[left] < height[right]) left++;
            else right--;
        }

        return maxVol;

    }
}
