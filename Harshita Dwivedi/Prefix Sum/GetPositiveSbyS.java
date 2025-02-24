public class GetPositiveSbyS {
    
    public int minStartValue(int[] nums) {
       int cumulativeSum = 0;
       int minSum = 0;

       for(int num: nums){
        cumulativeSum += num;
        minSum = Math.min(cumulativeSum, minSum);
       }
       return (1 - minSum);

    }
}