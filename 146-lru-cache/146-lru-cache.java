class LRUCache {
    LinkedHashMap<Integer,Integer> hm;
     
    public LRUCache(int capacity) 
    { 
        hm=new LinkedHashMap<>(16, .75f, true) {
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return size() > capacity;
                }
            };
    }
    
    public int get(int key) 
    {
        if(hm.containsKey(key))
        {
            return hm.get(key);
        }
        else return -1;
    }
    
    public void put(int key, int value)
    {
        hm.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */