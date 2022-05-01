class Solution {
    public boolean rotateString(String s, String goal) 
    {
        String origin=s+s;
        if(s.length()!=goal.length())return false;
        if(origin.contains(goal))return true;
        else return false;
    }
}