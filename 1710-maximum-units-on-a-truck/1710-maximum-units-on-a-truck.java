class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize)
    {
     
         Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int count=0;
        for(int[] boxType:boxTypes)
        {
            int bcount=Math.min(truckSize,boxType[0]);
            count+= bcount*boxType[1];
            truckSize-=bcount;
            if(truckSize==0)
            {
                break;
            }
        }
        return count;
    }
}