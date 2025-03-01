package Binarysearch;

import java.util.*;

class Solution {
    public int validtraianglenumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n-2;i++){
          for(int j =i+1;j<n-1;j++){
            int sum = nums[i]+nums[j];
              int k =binarysearch(nums,n-1,j+1,sum);
          count+=(k-j);
          }  
        }
        return count;
    } 

    public int binarysearch(int []nums,int max,int min,int target){
       
       while(min<=max){
        int mid = (min+max)/2;
        if(nums[mid]<target){
           min= mid+1;
        }
        else{
            max= mid-1;
        }
       }
       return max;
    }
} 