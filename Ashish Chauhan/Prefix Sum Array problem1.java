// import java.util.*;
public class problem1 
{
    public static int solution(int[] arr)
    {
        int n = arr.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        prefixSum[0] = arr[0];
        suffixSum[n-1] = arr[n-1];
        for(int i=1;i<n;i++)
        {
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            suffixSum[i] = suffixSum[i+1]+arr[i];
        }
        int[] answer = new int[n];
        for(int i=0;i<n;i++)
        {
            answer[i] = prefixSum[i]-suffixSum[i];
        }
        for(int i=0;i<n;i++)
        {
            if(answer[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int arr[]  = {2,5};    
        System.out.println(solution(arr));   
    }
}
/*Time complexity  = 4*O(n) = O(n)
Space Complexity = 3*O(n) = O(n);
 */
