import java.util.Scanner;

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        char[] result = s.toCharArray();
        
        int totalShift = 0;
        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            result[i] = (char) ((result[i] - 'a' + totalShift) % 26 + 'a');
        }
        
        return new String(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String s = scanner.next();
        
        System.out.print("Enter the number of shifts: ");
        int n = s.length();
        int[] shifts = new int[n];
        
        System.out.println("Enter the shift values:");
        for (int i = 0; i < n; i++) {
            shifts[i] = scanner.nextInt();
        }
        
        Solution solution = new Solution();
        String result = solution.shiftingLetters(s, shifts);
        
        System.out.println("Resultant string: " + result);
        
        scanner.close();
    }
}
