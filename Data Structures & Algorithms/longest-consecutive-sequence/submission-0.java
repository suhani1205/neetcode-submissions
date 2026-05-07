class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> store = new HashSet<>();
        for(int num : nums) {
            store.add(num);
            
        }

        for(int num : nums) {
            int res =0, curr =num;
            while(store.contains(curr)) {
                res++;
                curr++;
            }
            ans = Math.max(ans, res);
            
        }
        return ans;
    }
}
