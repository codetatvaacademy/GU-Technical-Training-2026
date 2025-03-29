package Binarysearch;

class threshold{
    
    private boolean isPossible(int[] nums, int divisor, int threshold) {
    
        for (int num : nums) {
            threshold -= num / divisor;

            if (num % divisor != 0) {
                --threshold;
            }
        }

        return threshold >= 0;
    }    
                
    public int smallestDivisor(int[] nums, int threshold) {
        
        int minDivisor = 1;
        int maxDivisor = 0;

        for (int num : nums) {
            maxDivisor = Math.max(maxDivisor, num);
        }

        while (minDivisor < maxDivisor) { 
            int divisor = (minDivisor + maxDivisor) / 2;

            if (isPossible(nums, divisor, threshold)) {
                maxDivisor = divisor;
            }   
            else {
                minDivisor = divisor + 1;
            }
        }

        return maxDivisor;
    } 
}     