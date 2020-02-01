class Solution(object):
    def maximumProduct(self, nums):
        product=1
        if(len(nums)==3):
            return nums[0]*nums[1]*nums[2]
            
        else:
            a=sorted(nums)
            if a[-1]*a[-2]*a[-3]>(a[0]*a[1]*a[-1]):
                return a[-1]*a[-2]*a[-3]
            else:
                return (a[0]*a[1]*a[-1])
        
        
