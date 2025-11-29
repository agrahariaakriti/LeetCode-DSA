class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if len(nums)==1:
            return nums[0]
        min_pro=1
        max_pro=1
        result=0        
        for x in range(len(nums)):
            # pro*=nums[x]
            if nums[x] <0:
                min_pro,max_pro=max_pro,min_pro
            min_pro=min(min_pro*nums[x],nums[x])
            max_pro=max(max_pro*nums[x],nums[x])
            result=max(max_pro,result)
        return result