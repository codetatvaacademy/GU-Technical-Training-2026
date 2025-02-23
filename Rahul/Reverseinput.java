import java.util.Scanner;
public class Reverseinput {
    public static void main(String[] args) {
        //WAP To accept an interger and check whether is egual to its reverse or not
       int num,orig,rem=0;
       int rev=0;
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the no: ");
       num = sc.nextInt();
       orig=num;
       while (num>0) 
       {
        rem= num%10;
        rev=(rev*10)+rem;
        num= num/10;
    } 
       if(orig==rev)
        System.out.println("\nYes the no is Equal to its reverse");
        else
                System.out.println("\n No the no is not equal");
       }    
       
    }


