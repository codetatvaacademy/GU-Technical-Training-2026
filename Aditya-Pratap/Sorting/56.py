class Solution(object):
    def merge(self, intervals):
        if len(intervals)==1:
            return intervals
        intervals.sort(key = lambda i : i[0])
        ans = [intervals[0]]
        for start, end in intervals[1:]:
            a=ans[-1][1]
            if start <= a:
                ans[-1][1]=max(a,end)
            else:
                ans.append([start, end])
        return ans
