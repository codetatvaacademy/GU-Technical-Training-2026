class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int k = 0;
        for(int i=0;k<groups.length && groups[k].length+i<=nums.length;i++){
            if(helper(groups[k],nums,i)){
                i+= groups[k++].length-1;
            }
        }
        return k==groups.length;
    }
    private boolean helper(int[] group,int[] nums, int start){
        for(int i=0;i<group.length;i++){
            if(group[i]!=nums[i+start]){
                return false;
            }
        }
        return true;
    }
}