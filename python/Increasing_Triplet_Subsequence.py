##334. Increasing Triplet Subsequence
import sys
class Solution(object):
    def increasingTriplet(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        ###longestSeq[i] = max(longestSeq[j+1],longestSeq[i] ) ===>>> O(n)
#         		min1			min2
# case 1:			case 2:			case 3:
# nums[i]			nums[i]			nums[i]
        if not nums or len(nums) < 3:
            return False
        
        min1 = min2 = sys.maxint
        for i in range(len(nums)):
            if nums[i] > min2:
                return True
            if nums[i] < min1:
                min1 = nums[i]
            if min1 < nums[i] < min2:
                min2 = nums[i]
        return False