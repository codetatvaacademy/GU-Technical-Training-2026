import java.util.*;
public class averageEvenandOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c1=0;
        int c2=0;
        int s=0;
        int s1=0;
        while(true)
        {
            System.out.println("Enter a number");
            int n =sc.nextInt();
            if(n==-1)
              break;
            if(n%2==0)
            {  
                s=s+n;
                c1++;
            }
            else
            {
                s1=s1+n;
                c2++;
            }
        
        }
        int avg1=s/c1;
        int avg2=s1/c2;
        System.out.println("Ther are total "+c1+" even numbers and there average is  "+avg1);
        System.out.println("Ther are total "+c2+" odd numbers and there average is  "+avg2);

    }
    
}
