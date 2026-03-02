from typing import List, Any


class Solution1:
    def binarySearch(self, nums, target, start, end)    :
        while start<=end:
            mid = start + (end - start) // 2
            if nums[mid] == target:
                return mid
            if nums[mid] > target :
                end = mid - 1
            else:
                start = mid + 1

        return -1

    def twoSum(self, numbers: List[int], target: int) -> list[int | Any]:
        for i in range(len(numbers)):
            complement = target - numbers[i]
            index = self.binarySearch(numbers, complement, i+1, len(numbers)-1)
            if index != -1:
                return [i+1,index+1]


class Solution2:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        start = 0
        end = len(numbers) - 1
        while start < end:
            s = numbers[start] + numbers[end]
            if s == target:
                return [start+1, end+1]
            if s > target:
                end -= 1
            else:
                start += 1
        return [-1,-1]

