class Solution {
    public int trap(int[] height) 
    {   if(height.length<=2)return 0;
        int trappedwater=0;
        //initially
        int leftMax=height[0];
        int rightMax=height[height.length-1];
        
        int l=1;
        int r=height.length-2;
        
        while(l<=r)
        {
            if(leftMax<=rightMax)
            {
                if(leftMax<height[l])
                {
                    leftMax=height[l];
                }
                else
                {
                    trappedwater+=(leftMax-height[l]);
                }
                
                l++;
            }
             else if(leftMax>rightMax)
                {
                    if(rightMax<height[r])
                    {
                        rightMax=height[r];
                    }
                 
                    else
                    {
                        trappedwater+=(rightMax-height[r]);
                    }
                 
                    r--;
                }
        }
     
        return trappedwater;
    }
}