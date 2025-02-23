package Arrays;
import java.util.Scanner;

public class NumberOfSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count=0;
            
        for(String detail : details){
            if(((detail.charAt(11) - '0') * 10 ) + (detail.charAt(12) - '0') > 60) count++ ;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of passengers(n): ");
        int n=sc.nextInt();
        sc.nextLine();

        String[] details=new String[n];
        System.out.println("Enter passenger details (Phone Number(10)Gender(M/F)age(2 digits)SeatAlloted(2 digits)): ");
        for(int i=0; i<n; i++){
            details[i]=sc.nextLine();
        }
        int seniorCount=countSeniors(details);
        System.out.println("Output: "+ seniorCount);
    }
}
