package hard.p42_trapping_rain_water;

class Solution {
    public int trap(int[] height) {
        int left=0, right = height.length-1, sum = 0, rightMax = 0, leftMax = 0;

        while (left <= right){
            if(height[left]<height[right]) {
                if (height[left]>leftMax){
                    leftMax = height[left];
                }
                else{
                    sum += leftMax - height[left];
                }
                left++;
            }
            else{
                if(height[right]>rightMax){
                    rightMax = height[right];
                }
                else{
                    sum += rightMax - height[right];
                }
                right --;

            }
        }
        return sum;
    }
}
