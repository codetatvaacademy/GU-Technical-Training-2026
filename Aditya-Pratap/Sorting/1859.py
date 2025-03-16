class Solution:
    def sortSentence(self, s: str) -> str:
        t=s.split()
        t=sorted(t,key=lambda x:int(x[-1]))
        t_final=[x[:-1] for x in t]
        return " ".join(t_final)