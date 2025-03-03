class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int v1 = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = v1+nums[left]+nums[right];
                if(sum==0){
                    set.add(new ArrayList<Integer>(Arrays.asList(v1,nums[left],nums[right])));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right--;
                }
            }
        }
        list.addAll(set);
        return list;
    }
}