// TIme Complexity - O(m*n) where n -> range of lasti and firsti ; m -> number of total bookings 
// Space Complexity - O(n) -> answer array
//                    O(n^2) -> for whole program
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of flights: ");
        int numOfFlights= sc.nextInt();
        
        System.out.print("Enter total number of bookings: ");
        int totalBookings = sc.nextInt();
        
        int bookings[][] = new int[totalBookings][3];

        System.out.print("Enter elements of booking array: ");
        for(int i=0; i<totalBookings; i++){                         // time complexity = O(m*3)  space complexity = O(m*3)
            for(int j=0; j<3; j++){                                     
                bookings[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int ans[] = new int[numOfFlights];
        ans = findReservedSeatsForEachFlight(numOfFlights, bookings);
        
        // printing output
        for(int i=0; i<ans.length; i++){                            // time complexity = O(n)
            System.out.print(ans[i] + " ");
        }
        
    }
    // for calculating the ans
    private static int[] findReservedSeatsForEachFlight(int numOfFlights, int[][] bookings){ //time compexity -> O(m*n) and SC -> O(n)
        int ans[] = new int[numOfFlights];
        for(int i=0; i<bookings.length; i++){
            int reserveSeats = bookings[i][2];
            ans[bookings[i][0]-1] += reserveSeats;
            if(numOfFlights!=bookings[i][1]){
                ans[bookings[i][1]] += (-1)*reserveSeats;
            }
        }
        for(int i=1; i<ans.length; i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}