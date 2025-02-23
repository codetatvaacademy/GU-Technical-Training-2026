// Leetcode --> 1422

package prefixsum;

import java.util.Scanner;

public class MaxumumSplit {
    public int maxScore(String s) {
      int once = 0;
            for(int i = 0; i< s.length(); i++){
                if(s.charAt(i) == '1'){
                    once++;
                }
            }
           int ans = 0;
           int zero = 0;
          for(int i = 0; i<s.length() - 1; i++){
              if(s.charAt(i) =='0'){
                 zero++;
                }
              else{
                   once--; 
                }
              ans = Math.max(ans,once+zero);
            }
      return ans;
   } 
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a binary string: ");
        String s = scanner.nextLine();


        MaxumumSplit maximumSplit = new MaxumumSplit();

        
        int result = maximumSplit.maxScore(s);

        
        System.out.println("The maximum score is: " + result);

        scanner.close();
   }
}
