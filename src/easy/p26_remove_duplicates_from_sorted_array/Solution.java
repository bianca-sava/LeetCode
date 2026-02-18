package easy.p26_remove_duplicates_from_sorted_array;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int removeDuplicates1(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        int j = 0;

        for(int i =0; i<nums.length; i++){
            if(uniqueNums.add(nums[i]) == true){
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }

    public int removeDuplicates2(int[] nums) {
        int max = nums[0];
        int j = 1;

        for(int i =1; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }

    public int removeDuplicates3(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
