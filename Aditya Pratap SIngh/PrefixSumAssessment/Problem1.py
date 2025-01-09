def middleindex(nums):
    n = len(nums)
    totalsum = sum(nums)
    leftsum = 0
    
    for i in range(n):
        if leftsum == (totalsum - leftsum - nums[i]):
            return i
        leftsum += nums[i]
    
    return -1

#nums = [2, 3, -1, 8, 4]
nums = [1,-1, 4]
res = middleindex(nums)
print(res)
#Time Complexity = O(n) 
#Space Complexity = O(1)
