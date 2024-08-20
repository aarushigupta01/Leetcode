class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
           mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
          int majorityElement = -1;
        int majorityCount = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > majorityCount) {
                majorityElement = entry.getKey();
                break; // Exit the loop once the majority element is found
            }
    }
    return majorityElement;
}
}