import java.util.Scanner;

public class Problem26 {
    //WAP to input a lower limit and an upper limit from user and print all the numbers in between the given limits
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lowerLimit=sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit=sc.nextInt();

        //Printing all the numbers in the range from lowerlimit to upperlimit
        System.out.println("Numbers between "+ lowerLimit + " and " + upperLimit + " are: ");
        for(int i=lowerLimit;i<=upperLimit;i++){
            System.out.println(i+ " ");
        } 

        
    }
    
}
