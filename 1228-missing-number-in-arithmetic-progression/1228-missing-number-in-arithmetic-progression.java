class Solution {
    public int missingNumber(int[] arr)
    {
      int diff= (arr[arr.length-1]-arr[0])/arr.length;
        
        int i=0;
        int a=arr[0];
        for(i=0;i<arr.length;i++)
        {
            if((a+i*diff)!=arr[i])
            {
                return a+i*diff;
            }
        }
      return a+i*diff;
    }
}