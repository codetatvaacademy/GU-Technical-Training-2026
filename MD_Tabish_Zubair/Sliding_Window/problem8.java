import java.util.Scanner;

public class problem8 {
    private static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U')
            return true;
        return false;
    }

    public static int maxVowels(String s, int k) {
        int maxVowel = 0;
        int start = 0;
        int e = 0;
        int c = 0;
        char[] st = s.toCharArray();
        while (e < s.length()) {

            if (isVowel(st[e]))
                c++;
                maxVowel = Math.max(maxVowel, c);
            if ((e - start + 1) == k) {
                if (isVowel(st[start]))
                    c--;
                start++;
            }
            

            e++;

        }
        return maxVowel;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter the K");
        int k=sc.nextInt();
        int ans=maxVowels(str, k);
        System.out.println(ans);
    }
}
