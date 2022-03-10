class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        LinkedHashMap<Character,Integer> pmap= new LinkedHashMap<>();
        LinkedHashMap<Character,Integer> smap= new LinkedHashMap<>();
        List<Integer> in= new ArrayList<>();
        //pattern frequency
        if (p.length() > s.length()) {
			return in;
		}
        
        for(int i=0;i<p.length();i++)
        {
            char c=p.charAt(i);
            char c2=s.charAt(i);
            pmap.put(c,pmap.getOrDefault(c,0)+1);
            smap.put(c2,smap.getOrDefault(c2,0)+1); 
        }
      
    
        int i=p.length();
        while(i<s.length())
        {
            if(smap.equals(pmap))
            {
                in.add(i-p.length());
            }
          
            char c=s.charAt(i);
            smap.put(c,smap.getOrDefault(c,0)+1);
              
            
            char rem=s.charAt(i-p.length());
            // System.out.println(rem);
            // System.out.println(smap.get(rem));
            if(smap.get(rem)==1)
            {
               //System.out.print("inside");
                smap.remove(rem);
            }
            else
            {
              smap.put(rem,smap.get(rem)-1);
            }
             
            //System.out.print(smap);
            i++; 
        }
        
            if(smap.equals(pmap))
            {
                in.add(i-p.length());
            }
       
     return in;
    }
}