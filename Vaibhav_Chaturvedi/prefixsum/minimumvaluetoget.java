class Solution {
    public int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;
        for(int a: nums){
            sum += a;
            if(sum < min) min = sum;
        }
        if(min < 0) return 1+(-(min));
        return 1;
    }
}
