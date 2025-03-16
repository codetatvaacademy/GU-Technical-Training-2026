class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> tempTarget = new ArrayList<>();
        

        for(int i = 0; i < nums.length; i++){
            tempTarget.add(index[i], nums[i]);
        }

        int target[] = new int[tempTarget.size()];

        for(int i = 0; i < target.length; i++){
            target[i] = tempTarget.get(i);
        }

        return target;
    }
}
