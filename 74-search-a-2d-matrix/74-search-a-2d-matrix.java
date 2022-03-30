class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        for(int[] mat:matrix)
        {
            if(found(target,mat))
               return true;
        }
               
        return false;       
    }
    public boolean found(int target,int[] mat)
     {
            int l=0;
            int h=mat.length-1;
          while(l<=h)
          {
              int mid=l+(h-l)/2;
              
              if(mat[mid]==target)
              {
                  return true;
              }
              if(mat[mid]<target)
              {
                  l=mid+1;
              }
              else
              {
                  h=mid-1;
              }
              
          }
         
         return false;
     }
}         