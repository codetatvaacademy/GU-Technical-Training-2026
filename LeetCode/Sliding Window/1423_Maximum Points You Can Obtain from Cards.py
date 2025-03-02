class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        n=len(cardPoints)
        start=0
        end=n-k
        totalSum=sum(cardPoints[end:])
        maxScore=totalSum
        while end<n:
            totalSum+=cardPoints[start]-cardPoints[end]
            maxScore=max(totalSum,maxScore)
            start+=1
            end+=1
        return maxScore


        