class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        max1=0
        count=0
        start=0
        end=0
        while(end <len(nums)):
            if nums[end]==0:
                count+=1
                if count>k:
                    while(count>k):
                        if nums[start]==0:
                            count-=1
                        start+=1

            max1=max(end-start+1,max1)
            end+=1            


        return max1                