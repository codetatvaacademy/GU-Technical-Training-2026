import java.util.*;
public class seriesPrint5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<=n;i++)
        {
           System.out.print(c+" ");
           a=b;
           b=c;
           c=a+b;
        }

    }
    
}
