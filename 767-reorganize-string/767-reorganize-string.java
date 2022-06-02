class Solution {
    public String reorganizeString(String s) {
        
        //hashmap\
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            
        }
        PriorityQueue<Character> q= new PriorityQueue<>((n1,n2)->map.get(n2)-map.get(n1));
        q.addAll(map.keySet());
        
        StringBuilder sb= new StringBuilder();
         while(q.size()>1)
         {
             char c1=q.poll();
             char c2=q.poll();
             sb.append(c1);
             sb.append(c2);
             map.put(c1,map.get(c1)-1);
             map.put(c2,map.get(c2)-1);
             if(map.get(c1)>=1){
                 q.add(c1);
                 
             }
             if(map.get(c2)>=1){
                 q.add(c2);
                 }
         }
        if(!q.isEmpty())
        {
            char c =q.poll();
            if(map.get(c)>1)return "";
            else sb.append(c);
        }
        
        return sb.toString();
    }
}