import java.util.Scanner;

public class PrintWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number between 1 and 7: ");
        int number = sc.nextInt();


        //Using if else 
        if(number==1){
            System.out.println("Monday");
        }
        else if(number==2){
            System.out.println("Tuesday");
        }
        else if(number==3){
            System.out.println("Wednesday");
        }
        else if(number==4){
            System.out.println("Thursday");
        }
        else if(number==5){
            System.out.println("Friday");
        }
        else if(number==6){
            System.out.println("Saturday");
        }
        else if(number==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("invalid input");
        }


        //using switch case
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        




        sc.close();
    }

}
