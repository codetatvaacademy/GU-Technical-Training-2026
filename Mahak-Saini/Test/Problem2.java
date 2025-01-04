import java.util.*;
public class Problem2 {
    public static void helper(int size, int bookings[][]){
        int totalReserveSeats[] = new int[size];
        // the TC is Approximately O(book*size)
        // the SC is O(size) only taking the array to return answer
        // Note = Not considerin the input field in SC
        for(int i = 0; i<bookings.length; i++){
            int startInd = bookings[i][0] -1 ;
            int endInd = bookings[i][1] - 1;
            int seat = bookings[i][2];
            System.out.println(startInd + " " + endInd + " " + seat);
            for(int j = startInd; j<=endInd; j++){
                totalReserveSeats[j] += seat;
            }
        }

        // final answer of the bookings 
        for(int i = 0; i<totalReserveSeats.length; i++){
            System.out.print(totalReserveSeats[i]+ " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter booking row length ");
        int book = sc.nextInt();
        int bookings[][] = new int[book][3];

        for(int i = 0; i<book; i++){
            for(int j = 0; j<3; j++){
                bookings[i][j] = sc.nextInt();
            }
        }
        
        helper(size, bookings);
        sc.close();
    }    
}
