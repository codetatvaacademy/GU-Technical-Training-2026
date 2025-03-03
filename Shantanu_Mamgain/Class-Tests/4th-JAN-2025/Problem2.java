import java.util.Arrays;
import java.util.Scanner;

public class SecondProblem {

    public static int[] TotalFlight(int[][]arr, int n){// Time complexity : O(N^2)  for this function
        int [] answer = new int [n];                   // Space Complexity: O(N)
        int left= 0;
        int right = 1;
        
        for(int j=0;j<arr.length; j++){
            if(right<arr[0].length){
                for(int i = left ; i<=right ;i++){
                    answer[(arr[0][i])-1] += arr[0][right+1];
                }

                right+=3;
                left+=3;
            }
        }
        return answer;
    }
    public static void main(String[] args) {// overall Time complexity: O(2N^2)
        Scanner sc = new Scanner(System.in);// overall space complexity: O(2N)

        System.out.print("Enter n: ");
        int n= sc.nextInt();

        int arr[][] = {{1,2,10},{2,3,20},{2,5,25}};
        

        System.out.print(Arrays.toString(TotalFlight(arr, n)));
        
    
        sc.close();
    }
}
