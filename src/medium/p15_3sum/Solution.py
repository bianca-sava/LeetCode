class Solution1:
    # Time complexity: O(n^3)
    # Space complexity: O(n)
    # Exceeds time limit
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        res = []
        for i in range (len(nums)-2):
            for j in range (i+1,len(nums)-1):
                for z in range (j+1, len(nums)):
                    if nums[i]+nums[j]+nums[z] == 0:
                        setl = list(map(set, res))
                        if set((nums[i],nums[j],nums[z])) not in setl:
                            res.append((nums[i],nums[j],nums[z]))
        return res


class Solution2:
    # Time complexity: O(n^2)
    # Space complexity: O(n)
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        res=[]

        for i in range(len(nums)-2):
            if i>0 and nums[i-1] == nums[i]:
                continue

            target = 0 - nums[i]
            low = i+1
            high = len(nums) - 1

            while low<high:
                if nums[low]+nums[high] == target:
                    res.append([nums[i],nums[low], nums[high]])
                    while low < high and nums[low] == nums[low+1]:
                        low += 1
                    while low < high and nums[high] == nums[high-1]:
                        high -= 1
                    low += 1
                    high-=1
                elif nums[low]+nums[high] > target:
                    high -= 1
                elif nums[low]+nums[high] < target:
                    low += 1

        return res