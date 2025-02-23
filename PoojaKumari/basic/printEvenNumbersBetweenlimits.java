// Question 29
import java.util.*;
public class printEvenNumbersBetweenlimits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lowerLimit=sc.nextInt();
        
        System.out.print("Enter upper limit: ");
        int upperLimit=sc.nextInt();
        for(int i=lowerLimit; i<=upperLimit;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
