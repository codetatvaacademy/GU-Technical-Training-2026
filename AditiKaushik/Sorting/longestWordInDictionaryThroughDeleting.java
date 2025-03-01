// 524. Longest Word in Dictionary through Deleting

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class longestWordInDictionaryThroughDeleting{
    public static String findLongestWord(String s, List<String> d) {
        String ans = "";
        for (String word : d) {
            if (isSubsequence(word, s)) {
                if (word.length() > ans.length() || word.length() == ans.length() && word.compareTo(ans) < 0) {
                    ans = word;
                }
            }
        }
        return ans;
    }

    private static boolean isSubsequence(final String a, final String b) {
        int i = 0;
        for (char c : b.toCharArray()) {
            if (i < a.length() && c == a.charAt(i)) {
                ++i;
            }
        }
        return i == a.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Enter the number of words in the dictionary: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter word " + (i + 1) + " : ");
            d.add(sc.nextLine());
        }
        System.out.println(findLongestWord(s, d));
        sc.close();
    }
}

//Time Complexity: O(n * k) where k is the length of s
//Space Complexity: O(1)