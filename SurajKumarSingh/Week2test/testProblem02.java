package Week2test;

import java.util.Scanner;

public class testProblem02 {
    public boolean ispossible(int []arr ,int mid, int h){

    for(int i = 0; i < arr.length; i++){
        if(arr[i] <= mid ){
            h++;
        }
        else {
            arr[i] -= mid;
        }
    }
    if(h < mid){
        return true;
    }
    return false;
}

 public int banana(int [] piles, int hour){
 int low = 0;
 int high = 0;
 int n = piles.length;
  for(int i = 0 ; i < n ; i++ ){
    high += piles[i];
  }
  while(low <= high){
    int mid = (low + high)/2;

    if(ispossible(piles, mid , hour)){
        high = mid - 1;
    }
    else{
        low = mid + 1;
    }
  }
  return low;
 }
 
 public static void main(String[] args) {
    
    testProblem02 ab = new testProblem02();

    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter the size of the matrix :");
    int  n = sc.nextInt();

    int [] arr = new int[n];
    
    System.out.println("Enter the element in the array: ");
    for(int i = 0; i< n; i++){
       arr[i] = sc.nextInt();
    }
    System.out.println("enter the target: ");
    int  hour = sc.nextInt();
    
    int result = ab.banana(arr, hour);
    
    System.out.println("Minimum banana eat: " + result);

    sc.close();
 }
}
// Time complexity O(nlogn)
// Space complexity O(1)
