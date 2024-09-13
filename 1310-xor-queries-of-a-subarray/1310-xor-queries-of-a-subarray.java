class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int pre[] = new int[arr.length];
        int ans[] = new int[queries.length];
        pre[0] = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            pre[i] = pre[i-1] ^ arr[i];
        }
        for(int i = 0; i<queries.length; i++)
        {
            int l = queries[i][0];
            int r = queries[i][1];
            if(l == 0)
            {
                ans[i] = pre[r];
            }
            else
            {
                ans[i] = pre[r] ^ pre[l-1];
            }
        }
        return ans;
    }
}