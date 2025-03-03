import java.util.Scanner;
public class maximumScoreAfterSplittingaString{
    public int maxScore(String s) {
        int ones = 0;
        int zeros = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones--;
            }
            max = Math.max(max, ones + zeros);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary string: ");
        String s = sc.nextLine();
        maximumScoreAfterSplittingaString solution = new maximumScoreAfterSplittingaString();
        int result = solution.maxScore(s);
        System.out.println("Maximum score after splitting: " + result);
    }
}
