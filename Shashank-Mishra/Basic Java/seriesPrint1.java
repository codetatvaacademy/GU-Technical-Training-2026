import java.util.*;
public class seriesPrint1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        { 
            s=(i*(i+1))/2;
            System.out.print( s+" ");
        }
        
   
    }
}
