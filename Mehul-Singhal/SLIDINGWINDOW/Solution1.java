import java.util.*;
public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int start =0;
        int end=0;
        int maxLength =0;
        int[] arr = new int[128];
        while(end<s.length()){
            char c =s.charAt(end);
            start = Math.max(start,arr[c]);
            maxLength=Math.max(maxLength,end-start+1);
            arr[c]=end+1;
            end++;
        

    }
    return maxLength;
}




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string :");
        String input = scanner.nextLine();
        Solution1 solution = new Solution1();
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("The length is : " + result);
        scanner.close();
    }
}