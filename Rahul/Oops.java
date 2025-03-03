import java.util.Scanner;
import java.lang.Math;
public class Oops {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        // int sum=0;
    
        //  while (n!=0) {
        //  int a=n%10;
        //     sum+=a;
        //     n/=10;
            
        // }System.out.println(sum);

        //     Reverse an integer
        while (n!=0) {
            int lastdigit=n%10;
            n/=10;
            System.out.print(lastdigit);
        }
               
        
        // int a;
        //   int sum =0;
        // do{
        //      a= sc.nextInt(); 
        //   sum = sum+=a;  
        // }while(a!=0);
        //     System.out.println(sum);

         
        // for (int i = 1; i<=10; i++) {
        //         int a =n*i;
        //         System.out.println(a);   
        // }

        
        }
}



        
    

