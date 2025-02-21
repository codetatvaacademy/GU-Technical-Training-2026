public class DaysConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days");
        int days = scanner.nextInt();

        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        System.out.println("Years" + years);
        System.out.println("Months" + months);
        System.out.println("Days" + remainingDays);

        scanner.close();
    }
}
