class Solution {
    public boolean isRobotBounded(String instructions)
    {
        int x=0;
        int y=0;
        String facing="N";
        
        for(int i=0;i<instructions.length();i++)
        {
            char c=instructions.charAt(i);
            if(c=='G')
            {
              if(facing.equals("N"))
                 y=y+1;
               else if(facing.equals("W"))
                 x=x-1;
               else if(facing.equals("E"))
                 x=x+1;
                else if(facing.equals("S"))
                  y=y-1;
            }
            else if(c=='R')
            {
              if(facing.equals("N"))
                  facing="E";
               else if(facing.equals("W"))
                  facing="N";
               else if(facing.equals("E"))
                  facing="S";
                else if(facing.equals("S"))
                  facing="W";
            }
            else if(c=='L')
            {
               if(facing.equals("N"))
                  facing="W";
               else if(facing.equals("W"))
                  facing="S";
               else if(facing.equals("E"))
                  facing="N";
                else if(facing.equals("S"))
                  facing="E";
            }
        }
        
        if(x==0&& y==0) return true;
        if(facing.equals("N"))return false;
        return true;
    }
    
}