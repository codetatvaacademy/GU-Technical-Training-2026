// using sliding window
// Time complexity -> O(n)
// Space Complexity -> O(1)

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] portfolio = new int[n];
        for(int i=0; i<n; i++){
            portfolio[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.println(findMaximumAverage(n, k, portfolio));
    }

    private static double findMaximumAverage(int n, int k, int[] portfolio){
        float maxAverage = 0;
        int start = 0;
        int end = 0;
        float sum = 0;
        while(end<portfolio.length){
            sum += portfolio[end];
            if(end-start+1 == k){
                maxAverage = Math.max(maxAverage, sum/k);
                sum-=portfolio[start];
                start++;
            }
            end++;
        }
        return maxAverage;
    }
}