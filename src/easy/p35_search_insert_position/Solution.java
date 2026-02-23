package easy.p35_search_insert_position;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while(left<=right){
            mid = (right+left)/2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]){
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return left;
    }

}
