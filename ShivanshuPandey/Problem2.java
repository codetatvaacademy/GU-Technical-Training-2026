public class Problem2 
{
    public static int[] findTotalSeatsReserved(int n , int[][] bookings){
        int[] answer = new int[n];
        for(int row = 0; row < bookings.length; row++){
            int i=bookings[row][0];
            int j=bookings[row][1];

            while(i<j){
               answer[i-1] += bookings[row][2];  //t.c = O(bookings.length + i<j);
               i++; 
            }
        }
        return answer;

    }

    public static void main(String[] args)
    {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     int[] arr = new int[n];
        //     for(int i = 0; i < n; i++) {
        //         arr[i] = sc.nextInt();
        // } 

        int n1 = 5;
        int[][] bookings1 = {
            {1, 2, 10},
            {2, 3, 20},
            {2, 5, 25}
        };
        System.out.println("Number of seats reserved = " + findTotalSeatsReserved(n1,bookings1));
        //s.c = O(n);
        
    }
}
