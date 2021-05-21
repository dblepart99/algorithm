class Solution:
    def trap(self, height: List[int]) -> int:
        volume = 0
        
        for i in range(1, len(height)-1):
            left = max(height[:i])
            right = max(height[i+1:])
            tmp = min(left, right)
            
            if(height[i] < tmp):
                volume += tmp - height[i]
            
        return volume
    
    
    
