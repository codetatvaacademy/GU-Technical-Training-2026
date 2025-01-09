import java.util.*;
public class seriesPrint7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter the value of x");
        int x=sc.nextInt();
        int s1=0;
        for(int i=1;i<=n;i++)
        {
            int s;
            if(i%2==0)
            {
                s=(-1)*(int)Math.pow(x,i);
            }
            else 
            {
                s=(int)Math.pow(x,i);
            }
            System.out.print(s+" ");
            s1+=s;
        }
        System.out.println("  the sum of the series "+s1);
    }
    
}
