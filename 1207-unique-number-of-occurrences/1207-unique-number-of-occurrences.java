class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        
       HashMap<Integer,Integer> map= new HashMap<>();
      
    HashMap<Integer,List<Integer>> list= new HashMap<>();
        
        for(int val:arr){
            
            map.put(val,map.getOrDefault(val,0)+1);
         }
        
        //System.out.println(map);
        
        for(Integer key:map.keySet()){
            
            int val=map.get(key);
            if(list.containsKey(val)){
                List<Integer> l=list.get(val);
                l.add(key);
                list.put(val,l);
            } 
            else
            {
                List<Integer> l= new ArrayList<>();
                l.add(key);
                list.put(val,l);
            }
        }
       // System.out.println(list);
        for(Integer l:list.keySet()){
            if(list.get(l).size()>1) return false;
        }
       return true;
    }
}