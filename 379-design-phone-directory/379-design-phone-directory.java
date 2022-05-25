class PhoneDirectory {
    boolean[] assigned;
    Queue<Integer> q;
    

    public PhoneDirectory(int maxNumbers) 
    {
        assigned= new boolean[maxNumbers];
        q=new LinkedList<>();
        for(int i=0;i<maxNumbers;i++)
        {
            q.add(i);
          
        }
        
    }
    
    public int get()
    {   
      if(q.isEmpty())return -1;
        else
        { 
            int num=q.poll();
            assigned[num]=true;
            return num;
        }
    }
    
    public boolean check(int number)
    {
       return !assigned[number];
        
    }
    
    public void release(int number) 
    {
       
        if(assigned[number])
        q.add(number);
        assigned[number]=false;
        
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */