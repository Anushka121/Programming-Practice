class MinStack {
    Stack<ArrayList<Integer>> st;
    

    public MinStack()
    {
       st= new Stack<ArrayList<Integer>>();
       
    }
    
    public void push(int val)
    {   
       
          if(!st.isEmpty())
          {
              int min=st.peek().get(1);
              ArrayList<Integer> a= new ArrayList<>();
              a.add(val);
              a.add(Math.min(min,val));
              st.push(a);
          }
         else
         {
             ArrayList<Integer> a= new ArrayList<>();
              a.add(val);
              a.add(val);
              st.push(a);
         }
       
        
    }
    
    public void pop() {
        if(!st.isEmpty())
        {
         st.pop();
        }
        
        
    }
  
    public int top()
    {
        if(!st.isEmpty())
            return st.peek().get(0);
        else return -1;
    }
    
    public int getMin()
    {    if(!st.isEmpty())
        return st.peek().get(1);
      return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */