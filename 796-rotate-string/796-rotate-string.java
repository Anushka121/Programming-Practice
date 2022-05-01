class Solution {
    public boolean rotateString(String s, String goal) 
    {
        
        if(s.length()!=goal.length())return false;
        String origin=s+s;
        if(origin.contains(goal))return true;
        else return false;
    }
}