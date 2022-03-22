class Solution {
    public String getSmallestString(int n, int k) 
    {
        
        StringBuilder sb= new StringBuilder();
        for(int i=n-1;i>=0;i--)
        {
            int v=0;
            if(k>=26+i)
            {
                v=26;
            }
            
            else{
                
                v=k-i;
                }
            
            k=k-v;
            sb.append((char)(97+v-1));
        }
        
        return sb.reverse().toString();
    }
}