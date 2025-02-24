<<<<<<< HEAD
import java.util.*;
public class armstrong {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number you want to check for armstrong");
    int n=sc.nextInt();
    int s=0;
    int d=n;
    while(n!=0)
    {
        int r=n%10;
        s=s+r*r*r;
        n=n/10;
    }
    if(s==d)
    {
        System.out.println("armstrong number");
    }
    else
    {
        System.out.println("Not a armstrong number");
    }
 }
    
}
=======
import java.util.*;
public class armstrong {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number you want to check for armstrong");
    int n=sc.nextInt();
    int s=0;
    int d=n;
    while(n!=0)
    {
        int r=n%10;
        s=s+r*r*r;
        n=n/10;
    }
    if(s==d)
    {
        System.out.println("armstrong number");
    }
    else
    {
        System.out.println("Not a armstrong number");
    }
 }
    
}
>>>>>>> 453c8f73 (Sliding Window add)
