import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("day is sunday");
                break;
                case 2 :
                System.out.println("day is monday");
            break;
            case 3:
            System.out.println("day is tuesday");
            break;
            case 4:
            System.out.println("day is wednesday");
            break;
            case 5: 
            System.out.println("day is thursday");
            break;
            case 6:
            System.out.println("day is friday");
            break;
            case 7:
            System.out.println("day is saturday");
        
            default:
            System.out.println("error");
                break;
        }
    }
    
}
