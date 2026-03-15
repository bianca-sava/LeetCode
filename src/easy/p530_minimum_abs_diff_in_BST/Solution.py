
 class TreeNode:
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right


class Solution:
    def sortInorder(self, root, sortedInorder):
        if root is None:
            return
        self.sortInorder(root.left, sortedInorder)
        sortedInorder.append(root)
        self.sortInorder(root.right, sortedInorder)



    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        sorted = []
        self.sortInorder(root, sorted)
        minn = sorted[1].val-sorted[0].val
        n = len(sorted)
        for i in range(n - 1, 0, -1):
            minn = min(minn, sorted[i].val - sorted[i - 1].val)
        return minn



