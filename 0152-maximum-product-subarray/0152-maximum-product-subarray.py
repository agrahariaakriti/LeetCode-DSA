class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max_pro = nums[0]
        min_pro = nums[0]
        result = nums[0]

        for i in range(1, len(nums)):
            num = nums[i]

            if num < 0:
                min_pro, max_pro = max_pro, min_pro

            max_pro = max(num, max_pro * num)
            min_pro = min(num, min_pro * num)

            result = max(result, max_pro)

        return result
