import java.util.*;
public class differrence {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();

        int dif =0;

        if(n2>=n1)
        {
          dif =n2-n1;
        }
        else 
          dif =n1-n2;
        
          System.out.println("differnece is "+ dif);
    }

}
