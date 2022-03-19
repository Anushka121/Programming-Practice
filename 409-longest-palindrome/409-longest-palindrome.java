class Solution {
    public int longestPalindrome(String s)
    {
        if(s.length()==1)return 1;
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
         int count=0;
       for(char c:hm.keySet()){   //to iterate over values of hashmap
            if(hm.get(c)%2==0){  //if for a char if value is even 
                count += hm.get(c);  //add it to the ans
                hm.put(c,0);  //and replace value with 0
            }
            if(hm.get(c)>2 && hm.get(c)%2==1){  //if value i.e freq is greater than 2 and odd
                count += (hm.get(c)-1);  //subtract 1 from value and add it to ans
                hm.put(c,1);  //now replace value with 1
            }
        }
        if(hm.containsValue(1)){  //here if 1 is present in vale
            count+=1;  //add one to ans  because "aaebb" is also palindrome
        }
        return count;
    }
}