public class Problem_1 {
    public int Sum(int[] nums){
        int totalsum = 0;

        for(int num: nums){
            totalsum += num;
        }
        int leftsum = 0;
        for(int i = 0; i < nums.length; i++){
            if(leftsum == totalsum - leftsum - nums[i]){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {2, 3, -1, 8, 4};
        Problem_1 obj = new Problem_1();

        System.out.println(obj.Sum(nums));
    }
}
