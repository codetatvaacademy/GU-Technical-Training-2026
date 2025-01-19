import java.util.Scanner;

public class SeniorCitizens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nums = new String[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.next();
        }
        sc.close();

        System.out.println(countSeniors(nums));
    }
    public static int countSeniors(String[] details) {
        int result = 0;
        for(int i=0; i<details.length; i++){
            int age = 0;
            String info = details[i];
            for(int j=11; j<13; j++){
                char ch = info.charAt(j);
                int h = ch - '0';
                age = age*10 + h;
            }
            if(age>60){
                result++;
            }
        }
        return result;
    }
}