// 899. Orderly Queue

import java.util.Arrays;
import java.util.Scanner;

class orderlyQueue{
    public static String orderly_Queue(String s, int k) {
        if (k > 1) {
            char[] characterArray = s.toCharArray();
            Arrays.sort(characterArray);
            return new String(characterArray);
        }
        String minStr = s;
        for (int i = 1; i < s.length(); i++) {
            String newStr = s.substring(i) + s.substring(0, i);
            if (newStr.compareTo(minStr) < 0) {
                minStr = newStr;
            }
        }
        return minStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(orderly_Queue(s, k));
        sc.close();
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(n)