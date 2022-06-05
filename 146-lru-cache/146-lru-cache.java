class Cache{
    int key;
    int val;
    Cache(int key,int val){
        this.key=key;
        this.val=val;
    }
    Cache prev;
    Cache next;
}

class LRUCache {
    HashMap<Integer,Cache> map;
    int capacity;
        Cache head;//= new Cache(0,0);
        Cache tail;//= new Cache(0,0);
        
    public LRUCache(int capacity) 
    {
        map= new HashMap<>();
        this.capacity=capacity;
        //Initail Confguartion
         head=new Cache(0,0);
         tail=new Cache(0,0);
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) 
    {
       if(map.containsKey(key)){
           Cache entry=map.get(key);
           deleteEntry(entry);
           insertEntry(entry);
           return entry.val;
       }
       else{
            return -1;
        }
           
        
      
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            deleteEntry(map.get(key));
        }
        else if(map.size()==capacity){
            deleteEntry(tail.prev);
        }
       
            Cache c= new Cache(key,value);
            insertEntry(c);
    }
    //to delete entry
    public void deleteEntry(Cache entry){
         map.remove(entry.key);
         entry.prev.next=entry.next;
        entry.next.prev=entry.prev;
    }
    // public void to insert
    public void insertEntry(Cache entry)
    {
        map.put(entry.key,entry);
        Cache headNext=head.next;
        head.next=entry;
        entry.prev=head;
        headNext.prev=entry;
        entry.next=headNext;
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */