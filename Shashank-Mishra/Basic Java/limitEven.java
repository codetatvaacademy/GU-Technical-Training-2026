import java.util.*;
public class limitEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower limit ");
        int ll=sc.nextInt();
        System.out.println("Enter the uppper limit");
        int ul=sc.nextInt();
        
        for(int i =ll ; i<=ul ; i++)
        { 
            if(i%2==0)
            {
             System.out.println(i);
            }
        }

    }
    
}