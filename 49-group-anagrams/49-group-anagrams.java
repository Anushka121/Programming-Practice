class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
      
        
        HashMap<String,List<String>> map= new HashMap<>();
        for(String s:strs)
        {
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String key=String.valueOf(c);
            if(map.containsKey(key))
            {
                map.get(key).add(s);
            }
            else
            {
                ArrayList<String> l= new ArrayList<>();
                l.add(s);
                map.put(key, l);
            }
        }
        
        System.out.println(map);
       List<List<String>> result= new ArrayList<>(map.values());
        return result;
    }
}