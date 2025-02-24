import java.util.Scanner;

public class problem10 {
    public static int equalSubstring(String s, String t, int maxCost) {
        int st=0;
        int e=0;
        int maxlen=0;
        int cost=0;
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        
        while(e<s1.length)
        {
            cost+=Math.abs(s1[e]-t1[e]);
            while(cost>maxCost)
            {
                cost-=Math.abs(s1[st]-t1[st]);
                st++;
            }
            maxlen=Math.max(maxlen, (e-st+1));
            e++;
        }
        return maxlen;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s=sc.nextLine();
        System.out.println("Enter the String 2");
        String t=sc.nextLine();
        System.out.println("Enter the maxCost");
        int maxCost=sc.nextInt();
        int ans=equalSubstring(s, t, maxCost);
        System.out.println(ans);
    }
}
