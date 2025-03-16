import java.util.Scanner;

class Solution {
    public int maxScore(String s) {
        int totalOnes = 0;
        for(char c : s.toCharArray()){
            if(c == '1') totalOnes++;
        }
        int maxScore = 0;
        int leftZeroes = 0;
        int leftOnes = 0;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '0') leftZeroes++;
            else leftOnes++;

            int rightOnes = totalOnes - leftOnes;
            int score = leftZeroes + rightOnes;
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String s = scanner.next();
        
        Solution solution = new Solution();
        int result = solution.maxScore(s);
        System.out.println("The maximum score is: " + result);
        
        scanner.close();
    }
}
