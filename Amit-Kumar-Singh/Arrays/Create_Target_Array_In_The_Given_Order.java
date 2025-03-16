class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List <Integer> targetAL = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            targetAL.add(index[i],nums[i]);
        }
        int[] target= new int[nums.length];
        int ind=0;
        for(int i: targetAL){
            target[ind]=i;
            ind++;
        }
        return target;
    }
}