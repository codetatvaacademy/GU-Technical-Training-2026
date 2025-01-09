package TechnicalTranning2026;

public class testProblem1 {
    public static int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i< n; i++){
          sum += nums[i];
        }  
        int leftsum = 0;
        int rightsum = 0;
        for(int i = 0; i<n; i++){
          rightsum = sum - leftsum - nums[i];
          if(leftsum == rightsum){
              return i;
          }
          else{
              leftsum += nums[i];
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,-1,8,4};  
        int result = findMiddleIndex(arr);
        System.out.println("Index : " + result);
    }
    
}
