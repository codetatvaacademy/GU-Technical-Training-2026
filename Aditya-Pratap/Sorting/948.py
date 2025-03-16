class Solution:
    def bagOfTokensScore(self, tokens: List[int], power: int) -> int:
        score=0
        tokens.sort()
        n=len(tokens)
        i,j=0,n-1
        while i<=j:
            if power>=tokens[i]:
                power-=tokens[i]
                score+=1
                i+=1
            elif score>0 and j-i>1:
                power+=tokens[j]
                score-=1
                j-=1
            else:
                break
        return score
            