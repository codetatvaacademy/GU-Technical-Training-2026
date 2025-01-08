import java.util.*;
public class seriesPrint3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=s*10+i;
            System.out.print(s+" ");
        }
    }
}
