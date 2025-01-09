import java.util.Scanner;

class Problem1
{

  public static int findMiddleIndex(int[] nums){
    if(nums.length<=2)
    return -1;
    
    int totalSum=0;
    for(int num:nums)
    totalSum += num;
    
    int leftSum=0;
    
    for(int i=0;i<nums.length;i++){
        
        
        if((totalSum-nums[i]) == leftSum)
           return i;
        totalSum -= nums[i];
        leftSum += nums[i];
    }
    return -1;
   }
   public static void main(String[] args){
    // int[] arr1 = {2,3,-1,8,4};
    // int[] arr2 = {1,-1,4};
    // int[] arr3 = {2,5};
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
    }  // O(n)
    sc.close();
    int middleIndex = findMiddleIndex(arr);
    System.out.print("MiddleIndex is = " + middleIndex);
    //t.c = O(n);
    //s.c = O(1);
   }
}