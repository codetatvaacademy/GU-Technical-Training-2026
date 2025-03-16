package Binarysearch;


import java.util.*;
class specialarray1608 {
    public static int specialArray(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            int result=0;
            for(int i =1;i<=n;++i){
           if(i == findifpossible(nums,i,n)){
                       return i;
                      }
                       }
                       return -1; 
                   }     
                   private static int findifpossible(int[] nums,int val,int n){
            int min = 0;
            int max = n-1;
            int index=n;
            while(min<=max){ 
                int mid = (min+max)/2;
                if(nums[mid]>=val){
                   index= mid;
                    max= mid-1;
                }
                else{
                    min = mid+1;
                }
            }  
    return n-index;
        } 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          
            System.out.println("enter values to enter ");
            int n=sc.nextInt();
            int [] nums = new int[n];
            System.out.println("enter values");
            for(int i=0;i<n;i++){
              nums[i]=sc.nextInt();
            }
            int ans = specialArray(nums);
            System.out.println(ans);
    }
}      