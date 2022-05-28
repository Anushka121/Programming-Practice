class FreqStack {
    int maxFreq;
    //freq calculation
    HashMap<Integer,Integer> map;
    //fre--> values with stack
    HashMap<Integer,Stack<Integer>> st;
    
    
    
    public FreqStack() 
    {
     map= new HashMap<Integer,Integer>();
     st= new HashMap<Integer,Stack<Integer>>();
     maxFreq=0;
    }
    
    public void push(int val) 
    {
        if(map.containsKey(val))
        {
            map.put(val,map.get(val)+1);
        }
        else
        {
            map.put(val,1);
        }
        if(maxFreq<map.get(val))
        {
            maxFreq= map.get(val);
            st.put(maxFreq,new Stack<Integer>());
        }
        
        st.get(map.get(val)).push(val);
      
    }
    
    public int pop() 
    {
         int val=st.get(maxFreq).pop();
         map.put(val,map.get(val)-1);
        
        if(st.get(maxFreq).size()==0)
            maxFreq--;
        
        return val;
    }
  
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */