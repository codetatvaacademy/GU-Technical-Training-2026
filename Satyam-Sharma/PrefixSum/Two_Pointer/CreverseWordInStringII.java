import java.util.Scanner;

public class CreverseWordInStringII {
    public static void reverse(char[] res,int start,int end){
        while(start<end){
            char temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;end--;
        }
    }

    public static String reverseWords(String s) {
        char[] res = s.toCharArray();
        int start = 0;
        int end = 0;
        while (end <= res.length) {
            if (end == res.length || res[end] == ' ') {
                reverse(res, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        return new String(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }
}
