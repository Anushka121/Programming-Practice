class Solution {
    public String mostCommonWord(String paragraph, String[] banned)
    {
        LinkedHashMap<String,Integer> map= new LinkedHashMap<>();
         HashSet<String> hs= new HashSet<>();
        for(int i=0;i<banned.length;i++)
        {
            hs.add(banned[i].toLowerCase());
        }
        paragraph=paragraph.replaceAll("\\W"," ") ;
        String s[]=paragraph.split(" ");
        for(String word:s)
        {
            if(!word.isEmpty() && !hs.contains(word.toLowerCase()) )
            map.put(word.toLowerCase(),map.getOrDefault(word.toLowerCase(),0)+1);
        }
        // System.out.println(map);
        // System.out.println(hs);
       int maxFreq=Integer.MIN_VALUE;
        String maxKey=" ";
        for(String key:map.keySet())
        {
            if(maxFreq<map.get(key))
            {
                maxFreq=map.get(key);
                maxKey=key;
            }
        }
        return maxKey;
    }
}