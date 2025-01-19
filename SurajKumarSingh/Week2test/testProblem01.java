package Week2test;

import java.util.Scanner;

public class testProblem01 {
   public static int search(int []arr, int target){
      int n = arr.length;
      int left = 0;
      int right = n - 1;

      while(left <= right){
        int mid = (left + right)/2;
        
        if(arr[left] == arr[mid] || arr[mid] == arr[right]){
                left++;
                right--;
                if(arr[mid] == target){
                return mid -1;
              }
        }
        else if(arr[left] < arr[mid]){
            if((arr[left] <= target) && (target < arr[mid])){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        else{
            if((arr[mid] < target) && (target <= arr[right])){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
      }
      return 0;
   }
   public static void main(String[] args) {

    testProblem02 srch = new testProblem02();

     Scanner sc = new Scanner(System.in);
     
     System.out.println("enter the size of the matrix :");
     int  n = sc.nextInt();

     int [] arr = new int[n];
     
     System.out.println("Enter the element in the array: ");
     for(int i = 0; i< n; i++){
        arr[i] = sc.nextInt();
     }
     System.out.println("enter the target: ");
     int  target = sc.nextInt();
     
     int result = search(arr, target);
     
     System.out.println("Number of occurence: " + result);

     sc.close();
   } 
}
// Time complexity O(logn)
// Space complexity O(1)
