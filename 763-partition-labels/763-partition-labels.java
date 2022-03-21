class Solution {
    public List<Integer> partitionLabels(String S) {
        
        //to store the last index of every character
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<S.length();i++)
        {
            map.put(S.charAt(i),i);
        }
        
        //start and end
        int anchorClosed = 0, anchor = 0;
        List<Integer> ans = new ArrayList();
        
        for (int i = 0; i < S.length(); ++i) {
            anchorClosed = Math.max(anchorClosed,map.get(S.charAt(i)));
            
            if (i == anchorClosed) {
                ans.add(i - anchor + 1);//
                anchor = i + 1;
            }
        }
        return ans;
    }
}