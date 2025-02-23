import java.util.*;
public class Firstproblem{
    public static int checkBalance(int [] arr){ // Time Compexity of checkBalance method is O(2N) 
        for(int i =1 ; i<arr.length; i++){      // Space Complexity of checkBalance method is O(1) as no additional array is created
            arr[i] += arr[i-1];
        }

        for(int i =0; i<arr.length; i++){
            if(i==0){
                if((arr[arr.length-1]-arr[0]) == 0){
                    return i;
                }
            }
            else if(i==arr.length){
                if(arr[i-1]==0){
                    return i;
                }
            }
            else{
                if(arr[i-1] == arr[arr.length-1]-arr[i]){
                    return i;
                }
            }
            
        }
        return -1;
    }
    public static void main(String[] args){  // Time complexity of entire code is O(3N)
        Scanner sc = new Scanner(System.in); // Space Complexity of entire code is O(N) as it depends on the size given by user

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i =0; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(checkBalance(arr));

        sc.close();
    }  
}
