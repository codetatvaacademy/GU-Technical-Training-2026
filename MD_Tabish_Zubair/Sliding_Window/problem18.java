import java.util.Scanner;

public class problem18 {
    public static int lengthOfLongestSubstring(String s) {
        int[] arr=new int[128];
        int st=0;
        int e=0;
        int maxlen=0;
        while(e<s.length())
        {
            int pos=s.charAt(e);
            st=Math.max(arr[pos],st);
            arr[pos]=e+1;
            maxlen=Math.max(maxlen , e-st+1);
            e++;
        }
        return maxlen;
    }
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        int ans=lengthOfLongestSubstring(str);
        System.out.println(ans);
    }
}
