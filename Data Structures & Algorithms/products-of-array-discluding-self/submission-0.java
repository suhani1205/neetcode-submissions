class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =  nums.length;
        int res[] = new int[n];
        int prod = 1, zero = 0;
        
        for(int num : nums) {
            if(num != 0)
            prod *= num;
            else 
            zero++;
        }

        if(zero > 1)
         return new int[n];

        for(int i = 0; i < n; i++) {
            if(zero > 0) {
            res[i] = (nums[i] == 0) ? prod : 0;
            System.out.println(res);
            }
            else
            res[i] = prod / nums[i];
        }
        return res;
    }
}  
