class Solution:
    def countTrapezoids(self, points: List[List[int]]) -> int:
        self.MOD=10**9+7
        dct={}
        for y in (points):
            if y[1] not in dct:
                dct[y[1]]=[]
            dct[y[1]].append(y[0])
        
        ls=[]
        # i=0
        for x in dct:
            n=len(dct[x])
            total_pair=(n*(n-1))//2
            ls.append(total_pair)            
            
        total_sum=sum(ls)
        count=0
        for x in ls:
            count=(count+((total_sum-x)*x)%self.MOD)%self.MOD
            total_sum-=x

        return count    
