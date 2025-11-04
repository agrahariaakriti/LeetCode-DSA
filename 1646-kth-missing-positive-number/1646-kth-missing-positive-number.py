class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        miss=0
        ans=0
        start=0
        end=len(arr)-1
        while(start<=end):
            mid=(start+end)//2
            missing=arr[mid]-(mid+1)
            # if(missing==k):
            if(missing<k):
                miss=missing
                ans=arr[mid]
                start=mid+1
            else:
                end=mid-1
        return ans+(k-miss)