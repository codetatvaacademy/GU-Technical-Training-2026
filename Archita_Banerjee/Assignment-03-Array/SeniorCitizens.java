
import java.util.Scanner;
public class SeniorCitizens {
    public static int countSeniors(String[] details) {
        int cnt=0;
        for(String detail:details){
            char tens= detail.charAt(11);
            char ones= detail.charAt(12);
            int age= (tens-'0')*10+ (ones-'0');
            if(age>60){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people details: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] details = new String[n];
        System.out.println("Enter the details :");
        for (int i = 0; i < n; i++) {
            details[i] = sc.nextLine();
        }
        int scnt = countSeniors(details);
        System.out.println("Number of seniors (age > 60): " + scnt);
    }
}
