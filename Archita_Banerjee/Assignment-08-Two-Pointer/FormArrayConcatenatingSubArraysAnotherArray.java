public class FormArrayConcatenatingSubArraysAnotherArray {
    public boolean canChoose(int[][] groups, int[] nums) {
        int gindex=0;
        int nindex=0;
        while(gindex < groups.length && nindex < nums.length){
            if(canMatch(groups[gindex],nums,nindex)){
                nindex+=groups[gindex].length;
                gindex++;
            }else{
                nindex++;
            }
        }
        return gindex==groups.length;
    }
    private boolean canMatch(int[]group, int[]nums,int start){
        if(start + group.length >nums.length){
            return false;
        }
        for(int i=0;i <group.length;i++){
            if(group[i]!=nums[start+i]){
                return false ;
            }
        }
        return true ;
    }
}
