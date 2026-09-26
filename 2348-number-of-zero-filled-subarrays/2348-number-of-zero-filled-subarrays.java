class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long answer =0;
        int consecutive =0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==0){
                consecutive++;
                answer +=consecutive;
            }else{
                consecutive=0;
            }
        }
        return answer;
        
    }
}