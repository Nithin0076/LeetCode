class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        gp(0,0,"",n,res);
        return res;
    }
    public void gp(int openP,int closeP, String s, int n, List<String> res)
    {
        if(openP == closeP && openP + closeP == 2*n)
        {
            res.add(s);
            return;
        }
        
        if(openP < n)
        {
            gp(openP+1,closeP,s+"(",n,res);
        }
        if(closeP < openP)
        {
            gp(openP, closeP+1, s+")", n,res);
        }
    }
}