import java.util.Scanner;

public class problem5 {
    public static int maxScore(String s) {
        int n=s.length();
        int a=0;
        for(int i=0;i<n-1;i++)
        {
            String left=s.substring(0,i);
            String right=s.substring(i,n);
            int l=0 , r=0;
            for(int j=0;j<left.length();j++)
            {
                if(left.charAt(j)=='0')
                l++;
            }
            for(int j=0;j<right.length();j++)
            {
                if(right.charAt(j)=='1')
                r++;
            }
            if(a<(l+r))
            a=l+r;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int ans=maxScore(str);
        
            System.out.println(ans);
    }
}
