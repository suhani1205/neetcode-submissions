class Solution {
    public int[] twoSum(int[] num, int target) {
        int l = 0, r = num.length-1;

        while(l < r) {
            int curSum = num[l] + num[r];

            if(curSum > target) {
                r--;
            } else if (curSum < target) {
                l++;
            } else {
                return new int[] {l+1, r+1};
            }

        }
        return new int[0];
    }
}
