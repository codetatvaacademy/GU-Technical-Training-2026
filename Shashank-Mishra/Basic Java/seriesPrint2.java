import java.util.*;
public class seriesPrint2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int s=0;
        for(int i=0;i<=n;i++)
        {
             s=s*10+1;
            System.out.print(s +" ");
        }
    }
    
}
