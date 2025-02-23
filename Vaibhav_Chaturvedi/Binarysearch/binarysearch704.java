package Binarysearch;



import java.util.*;
class binarysearch704 {
    public static int search(int[] nums, int target) {
            
            int min = 0;
            int max = nums.length-1;
            int result=-1;
            while(min<=max){
                int mid = (min+max)/2;
                if(nums[mid]>target){
                    max=mid-1;
                }
                else if(nums[mid]<target){
                    min=mid+1;
                }
                else{
                    result = mid;
                return result;
                }
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number of values");
            int n = sc.nextInt();
            int [] nums =new int[n];
            System.out.println("enter target");
            int target = sc.nextInt();
            System.out.println("enter values");
           
            for(int i=0;i<n;i++){
             nums[i]=sc.nextInt();
            }
            int ans = search(nums,target);
    }
}