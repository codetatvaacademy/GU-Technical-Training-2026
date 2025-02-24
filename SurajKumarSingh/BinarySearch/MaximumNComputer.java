//Leetcode -- 2141 

package BinarySearch;

import java.util.Scanner;

public class MaximumNComputer {

    private boolean ispossible(int [] batteries , int n, long extra, long mid){
        extra = 0;
        for(int i = 0 ;i < batteries.length; i++){
          extra += Math.min(batteries[i], mid);
        }
        return extra < n*mid;
    }
    public long maxRunTime(int n, int[] batteries) {
      long low = 0 ; long high = 0; long sum = 0;

      if(n == 0 || n > batteries.length){
        return -1;
      }
      
      for(int i = 0; i < batteries.length; i++){
        low = Math.min(low , batteries[i]);
        sum += batteries[i];
      } 
      high = sum;  

      while( low <= high){
        long mid = (low + high)/2; 
        if(ispossible(batteries, n ,sum , mid)){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
      }
        return high;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the number of computers: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the number of batteries: ");
        int batteryCount = sc.nextInt();
        
        int[] batteries = new int[batteryCount];
        
        System.out.println("Enter the battery capacities: ");
        for (int i = 0; i < batteryCount; i++) {
            batteries[i] = sc.nextInt();
        }
        
        MaximumNComputer maxNComputer = new MaximumNComputer();
        
        long result = maxNComputer.maxRunTime(n, batteries);
        
        System.out.println("The maximum run time is: " + result);
        
        sc.close(); 
    }
}
