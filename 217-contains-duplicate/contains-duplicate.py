class Solution(object):
    def containsDuplicate(self, nums):
        numDict = {}
        for i in range(len(nums)):
            if nums[i] in numDict:
                return True
            numDict[nums[i]] = "anything"
        return False
        