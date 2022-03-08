class Solution {
    public long minimalKSum(int[] nums, int k)
    {
        //for taking sum of all k sums(1--k)
        long sumK=0;
        //to check if duplicate present or not
        int prevVal=0;
        Arrays.sort(nums);
        for(int val:nums)
        {    
            //if(the val which is in the range of (1--k) exist in array 
            //means we have to take more k vals to create the (1--k) sum of array)
            //hen will increment k
            // we only require unique numbers hence will check duplicacy
            if(k>=val&& prevVal!=val)
            {
                sumK+=val;
                k++;
            }
            prevVal=val;
        }
        
        // There is a maths formula to find sum of n series
        // (n(n+1))/2
        
        //hench the sum of(1--k) will be like n series;
        //(k(k+1))/2;// which will include the numbers that are present in the array
        //hence to find the sum of all k numbers 
        // need remove the value of number which is present in array;
        // remove the sum of distnict element from array;
        
        return (long)(k+1)*k/2-sumK;
        
    }
}
    