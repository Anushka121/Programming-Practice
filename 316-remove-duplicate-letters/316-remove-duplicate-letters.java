class Solution {
    public String removeDuplicateLetters(String s)
    {
        //for storing frequency
       LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();
       for(int i=0;i<s.length();i++)
           {
               map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
           }
        //visit of value; 
        //boolean[]= new boolean[26];
        // to keep the track 
        Stack<Character>  st= new Stack<>();
        
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(st.contains(c)==false)
            { // System.out.println(c);
                if(!st.isEmpty() && c>st.peek())
                {
                    //System.out.println(c+"pushed");
                    st.push(c);
                }
                else
                {
                    while(!st.isEmpty()&&st.peek()>=c)
                    {
                        if(map.get(st.peek())>1)
                        {
                            map.put(st.peek(),map.get(st.peek())-1);
                           // System.out.println(st.pop()+"pop");
                            st.pop();
                            
                        }
                        
                        
                        
                          else  {
                              st.push(c);
                            break;
                          }
                        
                    }
                    if(!st.contains(c))
                    st.push(c);
                    
                      
                 }
                 
                }
               else
               {    
                 // System.out.println(c+" remv"); 
                map.put(c,map.get(c)-1);
                  
                  
               }
            }
         String result="";
        //System.out.println(map);
        for(int i=0;i<st.size();i++)
        {
            
            result+=st.get(i);
        }
        
        return result;
        }
       
    }
                                    