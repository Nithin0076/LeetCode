class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int x = 0; x<queries.length; x++)
        {
            for(int i = queries[x][0]; i<=queries[x][1]; i++)
            {
                ans[x] ^= arr[i];
            }
        }
        return ans;
    }
}