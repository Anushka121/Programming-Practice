class Solution {
    public String removeDuplicateLetters(String s) {
        //for the frequency of every number
        LinkedHashMap < Character, Integer > map = new LinkedHashMap < > ();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        // to store value
        Stack < Character > st = new Stack < > ();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (st.contains(c) == false) {
                if (!st.isEmpty() && c > st.peek()) {
                    st.push(c);
                } else {
                    while (!st.isEmpty() && st.peek() >= c) {
                        if (map.get(st.peek()) > 1) {
                            map.put(st.peek(), map.get(st.peek()) - 1);
                            st.pop();

                        } else {
                            st.push(c);
                            break;
                        }

                    }
                    //to check incase duplicate get pushed
                    if (!st.contains(c))
                        st.push(c);


                }

            } else {

                map.put(c, map.get(c) - 1);


            }
        }
        String result = "";
        //System.out.println(map);
        for (int i = 0; i < st.size(); i++) {

            result += st.get(i);
        }

        return result;
    }

}