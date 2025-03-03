class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        if len(arr)==2:
            return [arr]
        arr.sort()
        diff=arr[1]-arr[0]
        res=[[arr[0],arr[1]]]
        for i in range(2,len(arr)):
            if arr[i]-arr[i-1]<diff:
                res.clear()
                diff=arr[i]-arr[i-1]
                res.append([arr[i-1],arr[i]])
            elif arr[i]-arr[i-1]==diff:
                res.append([arr[i-1],arr[i]])
        return res