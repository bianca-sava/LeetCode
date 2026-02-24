package easy.p228_summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<String>();
        List<String> res = new ArrayList<>();
        int first = 0;

        for(int i = 1; i < nums.length ; i++){
            if(nums[i] != nums[i-1]+1){
                if(first != i-1)
                    res.add(nums[first]+"->"+nums[i-1]);
                else res.add(nums[first]+"");
                first = i;
            }
        }

        if(nums.length>1 && first != nums.length-1) res.add(nums[first]+"->"+nums[nums.length-1]);
        else res.add(nums[nums.length-1]+"");

        return res;

    }
}
