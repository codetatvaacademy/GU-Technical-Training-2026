import java.util.*;
public class seriesPrint4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        double s=0;
        for(int i=1;i<=n;i++)
        {
            s=Math.pow(i,3)-1;
            System.out.print(s+" ");
        }
    }
}