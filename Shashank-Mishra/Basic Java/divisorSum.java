import java.util.*;
public class divisorSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            s=s+i;
        }
        System.out.println(s);
    }
}
