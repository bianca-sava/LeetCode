package medium.p55_jump_game;

public class Solution {
    public boolean canJump1(int[] nums) {
        boolean[] canJump = new boolean[nums.length];
        canJump[0] = true;
        for (int i=0; i<nums.length; i++){
            if(canJump[i] == true){
                for(int j = nums[i]; j>0; j--){
                    if(i+j < nums.length)
                        canJump[i+j]=true;
                }
            }
        }
        return canJump[nums.length-1];

    }

    public boolean canJump2(int[] nums) {
        int maxReach = 0;

        for(int i=0;i<nums.length;i++){
            if(i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }

}
