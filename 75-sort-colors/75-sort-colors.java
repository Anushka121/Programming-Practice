class Solution {
    public void sortColors(int[] nums)
    {
        //Dutch National Algo
        
        int l=0;
        int m=0;
        int h=nums.length-1;
        
        while(m<=h)
        {
            if(nums[m]==0)
            {
                swap(l,m,nums);
                m++;
                l++;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else if(nums[m]==2)
            {
              swap(m,h,nums);
              //m++;
              h--;
            }      
        }
    }
    
    public void swap(int x,int y,int[] nums)
    {
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}