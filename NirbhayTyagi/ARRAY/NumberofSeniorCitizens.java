import java.util.Scanner;

class NumberofSeniorCitizens{
    public static int countSeniors(String[] details) {
        int n = details.length;
        int seniorCitizen = 0;
        for(int i=0; i<n; i++){
            int age = (details[i].charAt(11) - '0') * 10 + (details[i].charAt(12) - '0');
            if(age > 60){
                seniorCitizen++;
            }
        }
        return seniorCitizen ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        sc.nextLine();
        String[] details = new String[n];
        System.out.println("Enter the passenger details (15-character string for each): ");
        for (int i = 0; i < n; i++) {
            details[i] = sc.nextLine();
        }
        System.out.println("Number of passengers older than 60: " + countSeniors(details));
    }
}