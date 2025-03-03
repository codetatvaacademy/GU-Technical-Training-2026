class Solution:
    def intervalIntersection(self, firstList: List[List[int]], secondList: List[List[int]]) -> List[List[int]]:
        if len(firstList)==0 or len(secondList)==0:
            return []
        
        i,j=0,0
        res=[]
        while i < len(firstList) and j < len(secondList):
            l = max(firstList[i][0], secondList[j][0])
            r = min(firstList[i][1], secondList[j][1])

            if l <= r:
                res.append([l, r])
            
            if firstList[i][1] < secondList[j][1]:
                i += 1
            else:
                j += 1
        
        return res
            

        