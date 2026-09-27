class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int cons =0;
        long answer =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cons++;
                answer +=cons;
            }else{
                cons =0;
            }
        }
        return answer;
        
    }
}