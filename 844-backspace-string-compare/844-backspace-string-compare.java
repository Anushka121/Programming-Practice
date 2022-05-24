class Solution {
    public boolean backspaceCompare(String s, String t)
    {
      
        return check(s).equals(check(t));
            
    }
    public String check(String s)
    {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='#' && st.isEmpty()!=true)
            {
                st.pop();
            }
            else if( c!='#')
            {
                st.push(c);
            }
        }
        
        return String.valueOf(st);
            
    }
    
}