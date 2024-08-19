class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0;
        int n=nums.length;
        int tot=n*(n+1)/2;
        for(int i=0;i<n;i++){
           xor1=xor1+nums[i];
        }
        return tot-xor1;
    }
}