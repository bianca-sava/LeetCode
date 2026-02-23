package easy.p108_sorted_array_to_BST;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return builder(nums,0, nums.length-1);
    }

    public TreeNode builder(int[] nums, int left, int right){
        if(left>right) return null;
        int mid = (right+left)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = builder(nums, left, mid-1);
        root.right = builder(nums, mid+1, right);

        return root;

    }
}
