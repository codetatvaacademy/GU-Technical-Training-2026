import java.util.Scanner;

public class KreverseVowelsOfaString {
    public static boolean isVowel(char ch){
        return ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' || ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }

    public static String reverseVowels(String sr) {
        char[] res = sr.toCharArray();
        int s = 0;
        int e = res.length - 1;
        while (s < e) {
            if (!isVowel(res[s]))
                s++;
            else if (!isVowel(res[e]))
                e--;
            else {
                char temp = res[s];
                res[s] = res[e];
                res[e] = temp;
                s++;
                e--;
            }
        }
        return new String(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String sr = sc.nextLine();
        System.out.println(reverseVowels(sr));
    }
}
