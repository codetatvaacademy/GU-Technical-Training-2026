package sliding_window;


import java.util.*;

class countnoofnice { 
    private static int numbersub2(int nums[],int k){
       int start =0;
       
              int nicevalue =0;
            
              for(int end=0;end < nums.length;end++){
                 if(nums[end]%2 == 1){
                   k--;
                 } 
                
                   while(k<0){
                       if(nums[start]%2==1){
                         k++;
                          
                       }
                       start++;
                   }
                   
                  
                  nicevalue=nicevalue+(end-start+1);
              } 
              return nicevalue; 
       }
           public static int numberOfSubarrays(int[] nums, int k) {
                      int left = numbersub2(nums,k-1);
                  int right = numbersub2(nums,k);
                  int result = right-left;
                  return result;
                 } 
                 public static void main(String[] args) {
                   Scanner sc = new Scanner(System.in);
                   System.out.println("enter no of values to enter");
                   int n = sc.nextInt();
                   System.out.println("enter  value of k");
                   int k = sc.nextInt();
                   int nums[] = new int[n];
                   for(int i=0;i<n;i++){
                       nums[i]=sc.nextInt();
                   }
                   int ans = numberOfSubarrays(nums,k);
          }   
       }     