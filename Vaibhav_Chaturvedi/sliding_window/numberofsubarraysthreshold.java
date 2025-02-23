package sliding_window;

import java.util.*;



public class numberofsubarraysthreshold {
    
        public int numOfSubarrays(int[] arr, int k, int threshold) {
            
            int start=0;
            int end =k;
            int sum=0;
            int avg=0;
            int count=0;
            for(int i=0;i<k;i++){
                sum=sum+arr[i];
            }  
            avg = sum/k;
            if(avg>=threshold){
                count++;
            }
            while(end<arr.length && start<arr.length){
                sum = sum+arr[end]-arr[start];
                start++;
                avg = sum/k;
                if(avg>=threshold){
                count++;
            }
            end++;
            } 
    
    return count;
        }
    }
