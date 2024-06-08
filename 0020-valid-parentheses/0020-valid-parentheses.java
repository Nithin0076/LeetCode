class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hm = new HashMap<Character,Character>();
        hm.put('}','{');
        hm.put(']','[');
        hm.put(')','(');
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(hm.containsKey(c))
            {
                    if(!stack.empty() && hm.get(c) == stack.peek() )
                    {
                        if(!stack.empty())
                            stack.pop();
                    }
                    else
                        return false;
            }
            else
                stack.push(c);
        }
        if(!stack.empty())
            return false;
        else
            return true;
    }
}