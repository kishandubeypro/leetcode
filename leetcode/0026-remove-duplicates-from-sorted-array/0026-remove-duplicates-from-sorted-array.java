class Solution {
    public int removeDuplicates(int[] nums) {
        int[] result = new int[nums.length];
        result[0]=nums[0];
        int k=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                result[k]=nums[i];
                k++;
            }else{
                continue;
            }

            
        }

        for (int i = 0; i < k; i++) {
            nums[i] = result[i];
        }

        return k;
    }
}