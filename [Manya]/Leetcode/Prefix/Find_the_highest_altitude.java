import java.util.Scanner;

public class Find_the_highest_altitude {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;

        for (int i = 1; i <= gain.length; i++) {
            altitude[i] = gain[i - 1] + altitude[i - 1];
        }

        int MaxAltitude = Integer.MIN_VALUE;

        for (int alt : altitude) {
            if (alt > MaxAltitude) {
                MaxAltitude = alt;
            }
        }

        return MaxAltitude;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] gain = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            gain[i] = scanner.nextInt();
        }
        
        Find_the_highest_altitude solution = new Find_the_highest_altitude();
        int result = solution.largestAltitude(gain);
        System.out.println("The largest altitude is: " + result);
        
        scanner.close();
    }
}
