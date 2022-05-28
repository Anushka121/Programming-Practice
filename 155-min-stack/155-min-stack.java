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
       
         st.pop();
        
        
    }
  
    public int top()
    {
        
            return st.peek().get(0);
       
    }
    
    public int getMin()
    {    
        return st.peek().get(1);
      
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