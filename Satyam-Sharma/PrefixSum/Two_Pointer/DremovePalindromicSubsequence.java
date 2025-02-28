import java.util.Scanner;

public class DremovePalindromicSubsequence {
    public static boolean isPalindrome(String s){
        int start =0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;end--;
        }
        return true;
    }

    public static int removePalindromeSub(String s) {
        boolean res = isPalindrome(s);
        if (res)
            return 1;
        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(removePalindromeSub(s));
    }
}
