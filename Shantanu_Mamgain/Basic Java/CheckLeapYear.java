import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isleapYear=false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isleapYear=true;
                } 
                else{
                    isleapYear=false;
                }
            }
            isleapYear = true;
            
        }

        if(isleapYear==true){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("not a leap year");
        }

        sc.close();
    }
}
