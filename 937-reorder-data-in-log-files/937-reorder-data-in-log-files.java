class Solution {
    public String[] reorderLogFiles(String[] logs) 
    {
        ArrayList<String> letter_log= new ArrayList<>();
      ArrayList<String>  number_log= new ArrayList<>();
        
        for(String log:logs)
        {
            String[] lg=log.split(" ");
            
            if(Character.isDigit(lg[1].charAt(0))){
                number_log.add(log);
            }
            else
            {
                letter_log.add(log);
            }
        }
        
        Collections.sort(letter_log,new Comparator<String>(){
            
            @Override
            public int compare(String s1,String s2)
            {
                String first=s1.substring(s1.indexOf(" ")+1);
                String second=s2.substring(s2.indexOf(" ")+1);
                if(first.equals(second))
                {
                   return s1.split(" ")[0].compareTo(s2.split(" ")[0]);
                }
                else
                {
                    return first.compareTo(second);
                }
            }
            
        });
        
        
            letter_log.addAll(number_log);
        
          return letter_log.toArray(new String[letter_log.size()]);
        
        
    }
}
        
                         