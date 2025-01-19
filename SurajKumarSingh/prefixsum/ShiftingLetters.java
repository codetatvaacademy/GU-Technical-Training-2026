//LeetCode --> 848

package prefixsum;

import java.util.Scanner;

public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        int shift = 0;
        char [] str = s.toCharArray();
          for(int i = str.length -1; i >= 0; i--){
               shift = (shift + shifts[i])%26;
               str[i] = (char)((str[i] - 'a' + shift) %26 + 'a');
            } 
        return new String(str); 
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the string (lowercase letters only): ");
        String s = scanner.nextLine();

    
        System.out.print("Enter the number of shifts: ");
        int n = scanner.nextInt();
        int[] shifts = new int[n];

        
        System.out.println("Enter the shifts (space-separated integers):");
        for (int i = 0; i < n; i++) {
            shifts[i] = scanner.nextInt();
        }

        
        ShiftingLetters shiftingLetters = new ShiftingLetters();

        
        String result = shiftingLetters.shiftingLetters(s, shifts);

        
        System.out.println("The resulting string after shifting is: " + result);

        scanner.close();
    }
}
