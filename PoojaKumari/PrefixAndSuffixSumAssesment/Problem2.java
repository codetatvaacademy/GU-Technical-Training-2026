//package GU-Technical-Training-2026.PoojaKumari.PrefixAndSuffixSumAssesment;
import java.util.*;


public class Problem2 {
    public  static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int start = bookings[i][0] - 1;
            int end = bookings[i][1];
            int seats = bookings[i][2];
            result[start] = result[start] + seats;
            if (end != n) {
                result[end] = result[end] + seats * (-1);
            }
        }
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i] + result[i - 1];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of flights: ");
        int n=sc.nextInt();
        System.out.println("Enter number of columns :");
        int Rowlength=sc.nextInt();
        int[][] bookings=new int[Rowlength][3];
        System.out.println("Enter the elements of booking array: ");
        for(int i=0;i<Rowlength;i++){
            bookings[i][0]=sc.nextInt();
            bookings[i][1]=sc.nextInt();
            bookings[i][2]=sc.nextInt();
        }
        int[] answer=new int[n];
        answer=corpFlightBookings(bookings,n);
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i] + " ");
        }
        sc.close();
    }
    
}
// time complexity =O(n)
//space complexity=O(1)