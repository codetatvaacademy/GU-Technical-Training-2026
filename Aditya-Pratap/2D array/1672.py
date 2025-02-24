class Solution:
    def maximumWealth(self, a: List[List[int]]) -> int:
        res=0
        for i in a:
            if sum(i)>res:
                res=sum(i)
        return res