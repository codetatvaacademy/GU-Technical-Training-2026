import java.util.Scanner;

public class input4digitno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int digit1 = no / 1000;        
        int digit2 = (no / 100) % 10;    
        int digit3 = (no / 10) % 10;   
       int digit4 = no % 10;      
System.out.println(digit1); 
System.out.println(digit2); 
System.out.println(digit3); 
System.out.println(digit4); 
}
}
