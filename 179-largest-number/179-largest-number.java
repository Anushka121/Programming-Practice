
class Comp implements Comparator<String>
{
   @Override
   public int compare(String a,String b)
   {
      String x=a+b;
      String y=b+a;
      return x.compareTo(y) > 0 ? -1 : 1;
   }
}
class Solution {

    public String largestNumber(int[] nums)
    {
        
        ArrayList<String> l= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            l.add(String.valueOf(nums[i]));
        }
        Collections.sort(l,new Comp());
    
    if(l.get(0).equals("0"))
    return "0";
    int n=l.size();
    String result="";
    for(int i=0;i<n;i++)
    {
      result+=l.get(i);
    }
    
    return result;}
}