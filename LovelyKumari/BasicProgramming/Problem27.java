import java.util.Scanner;

public class Problem27 {
    //WAP to input a lower limit and an upper limit from user and print all the even numbers in between the given limits
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lowerLimit=sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit=sc.nextInt();

        //Printing all the even numbers in the range of lowerLimit to upperLimit

        System.out.println("Even numbers "+ lowerLimit+ " and " + upperLimit+ " are:");
        if(lowerLimit % 2 !=0){
            lowerLimit++ ;
        } 
        for(int i=lowerLimit;i<=upperLimit ; i+=2){
            System.out.println(i+" ");

        }
    }
}
