package POTD;

import java.util.*;
//
class minopthreshold{

    public static int minOperations(int[] nums, int k) {
            int count=0;
           PriorityQueue<Long> pq = new PriorityQueue<>();
           for(int i : nums){
            pq.offer((long)i);
           }
           while(pq.size()>=2){
            long x = pq.poll();
            if(x>=k){
                break;
            }
            long y = pq.poll();
            long result = Math.min(x,y)*2+Math.max(x,y);
            pq.offer(result);
            count++;
           }
           return count;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter threshold value");
           int n=sc.nextInt();
           System.out.println("enter number of values to enter");
           int m = sc.nextInt();
           int nums[]= new int[m];
           for(int i=0;i<m;i++){
             nums[i]= sc.nextInt();
           }
           int ans = minOperations(nums,n);
           System.out.println(ans);
    }
}