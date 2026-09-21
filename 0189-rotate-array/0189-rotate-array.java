class Solution {
    public void rotate(int[] nums, int k) {
        int[] result =new int[nums.length];
        k = k%nums.length;
        int index=0;
        for(int i=nums.length-k;i<nums.length;i++){
            result[index] = nums[i];
            index++;
        }
        for(int i=0;i<nums.length-k;i++){
            result[index] =nums[i];
            index++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=result[i];
        }
        
    }
}