import java.util.Scanner;

public class Opermutationinstring {
    public static boolean isPermutation(int[] freqs1){
        for(int i:freqs1){
            if(i>0){
                return false;
            }
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length())
            return false;

        int[] freqs1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freqs1[s1.charAt(i) - 'a']++;
        }

        int k = s1.length();
        int i = 0;
        int j = 0;
        while (j < s2.length()) {
            freqs1[s2.charAt(j) - 'a']--;
            if (j - i + 1 == k) {
                if (isPermutation(freqs1)) {
                    return true;
                }
                freqs1[s2.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(checkInclusion(s1, s2));
    }
}
