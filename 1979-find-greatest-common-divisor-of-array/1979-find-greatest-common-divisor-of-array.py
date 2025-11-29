class Solution:
    def findGCD(self, nums: List[int]) -> int:
        min_no=min(nums)
        max_no=max(nums)
        return self.gcd(min_no,max_no)
    def gcd(self,a,b):
        if b==0:
            return a
        else:
            return self.gcd(b,a%b)        