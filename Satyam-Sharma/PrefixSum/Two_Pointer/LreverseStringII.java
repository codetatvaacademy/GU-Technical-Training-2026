import java.util.Scanner;

public class LreverseStringII {
    public static void reverse(char[] res,int i,int j){
        while(i<j){
            char temp = res[i];
            res[i]=res[j];
            res[j]=temp;
            i++;j--;
        }
    }

    public static String reverseStr(String s, int k) {
        char[] res = s.toCharArray();
        int i = 0;
        while (i < res.length) {
            int j = Math.min(res.length - 1, i + k - 1);
            reverse(res, i, j);
            i += 2 * k;
        }
        return new String(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(reverseStr(s,k));
    }
}
