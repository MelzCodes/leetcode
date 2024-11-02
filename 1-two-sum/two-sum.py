class Solution(object):
    def twoSum(self, nums, target):
        numDict = {}
        n = len(nums)

        for i in range(n):
            comp = target - nums[i]
            if comp in numDict:
                return [numDict[comp], i]
            numDict[nums[i]] = i

        return []

        