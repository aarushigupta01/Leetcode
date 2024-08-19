class Solution {
    public void sortColors(int[] nums) {
int n=nums.length;
int countZero=0;
int countOne=0;
int countTwo=0;
for(int i=0;i<n;i++){
    if(nums[i]==0){
    countZero++;
    }
    else if(nums[i]==1){
        countOne++;
    }
    else{
        countTwo++;
    }
}

for(int i=0;i<countZero;i++){
    nums[i]=0;
}
for(int i=countZero;i<countZero+countOne;i++){
    nums[i]=1;
}
for(int i=countZero+countOne;i<nums.length;i++){
    nums[i]=2;
}
    }
}