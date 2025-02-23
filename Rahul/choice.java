import java.util.Scanner;
public class choice {
    public static void main(String[] args) {
        System.out.println("Enter the input: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter input(1,2,3,4)");
        char num= sc.next().charAt(0);
        switch (num){
            case '1':
            int fact=1; 
            for (int i=1; i<=n; i++){
                fact=fact*i;
               
            } System.out.println(fact);
            break;
            case '2':
            if (n%2==0) {
                System.out.println("Not a prime no: ");
                
            }else{
                System.out.println("Number is prime");
            }
            break;
            case '3':
            if (n%2==0) {
                System.out.println("Even no: ");                
            }else{
                System.out.println("Odd no ");
            }break;
            default:
            System.out.println("Quit Thank You");
            break;

        }



    }
    
}
