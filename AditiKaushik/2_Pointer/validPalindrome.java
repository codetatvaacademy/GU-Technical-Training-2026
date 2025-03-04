// 125. Valid Palindrome

import java.util.Scanner;

class validPalindrome{
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                ++i;
            }
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                --j;
            }
            else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            else {
                ++i;
                --j;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complextiy: O(1)