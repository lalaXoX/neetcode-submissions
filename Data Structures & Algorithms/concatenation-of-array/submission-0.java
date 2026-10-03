class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length * 2;
        int ans[] = new int[length];
        for(int i = 0; i< length; i++){
            if(0<=i && i<=(nums.length-1)){
                ans[i] = nums[i];
            }else{
                ans[i]=nums[i-nums.length];
            }
            
        }
        return ans;
    }
}