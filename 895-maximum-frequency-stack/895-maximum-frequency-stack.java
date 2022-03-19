class FreqStack {
    Map<Integer, Integer> map;
    Map<Integer, Stack<Integer>> freq;
    int maxfreq;
    
    //constructor 
    public FreqStack() {
        map = new HashMap<>();
        freq = new HashMap<>();
        maxfreq = 0;
    }
    //1. Incrementing value in frequency map and its count
    //2. updating maxfreq
    //3. adding value in stack with frequency
    public void push(int x) {
        int Freq = map.getOrDefault(x,0)+1;
        map.put(x, Freq);
        if(Freq>maxfreq){
            maxfreq=Freq;
        }
        //checking if frquency is already present in freqstack or not otherwise create new stack  of new frequency and add element to that stack.
        freq.computeIfAbsent(Freq, freqStack-> new Stack<>()).push(x);
    }
    //1. return and remove top element of maxfreq
    //2. update the maxfreq(decrementing)
    //3. updating count in frequency map
    public int pop() {
        Stack<Integer> st = freq.get(maxfreq);
        int top = st.pop();
        if(st.isEmpty()){
            maxfreq--;
        }
        map.put(top, map.get(top)-1);
        return top;
    }
}
