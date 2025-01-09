def seesaw(nums):
    n = len(nums)
    if n == 0:
        return -1
    
    left = [0] * n
    right = [0] * n
    

    left[1] = nums[0]
    for i in range(2, n):
        left[i] = left[i - 1] + nums[i - 1]
    
 
    right[-2] = nums[-1]
    for i in range(n - 3, -1, -1):
        right[i] = right[i + 1] + nums[i + 1]
    
 
    for i in range(n):
        if left[i] == right[i]:
            return i
    
    return -1


nums = [2, 3, -1, 8, 4]
print(seesaw(nums))  

nums = [1, -1, 4]
print(seesaw(nums)) 

nums = [2, 5]
print(seesaw(nums)) 