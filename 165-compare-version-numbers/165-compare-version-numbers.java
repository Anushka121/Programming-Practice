class Solution {
    public int compareVersion(String version1, String version2) 
    {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        
      if(v1.length==v2.length)
      {
          int n1=Integer.parseInt(v1[0]);
          int n2=Integer.parseInt(v2[0]);
          
          if(n1>n2)return 1;
          if(n1<n2)return -1;
          else
          {
              for(int i=1;i<v1.length;i++)
              {
                  int nu1=Integer.parseInt(v1[i]);
                  int nu2=Integer.parseInt(v2[i]);
                  if(nu1>nu2)return 1;
                  if(nu1<nu2)return -1;
              }
              return 0;
          }
      }
       else
        {
          int len=Math.max(v1.length,v2.length);
           for(int i=0;i<len;i++)
           { 
               int nu1= i>=v1.length?0:Integer.parseInt(v1[i]);
               int nu2= i>=v2.length?0:Integer.parseInt(v2[i]);
                 if(nu1>nu2)return 1;
                  if(nu1<nu2)return -1;
                 
           }
          
           return 0;
        }
      
    
}
}