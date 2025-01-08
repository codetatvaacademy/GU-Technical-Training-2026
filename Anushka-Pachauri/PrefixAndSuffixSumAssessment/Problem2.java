import java.util.*;
class Problem2{
    public static int[] totalSeatsReserved(int n, int[][] bookings){
        
        int[] difference=new int[n+1];
        int[] answer = new int[n];

        for(int[] booking : bookings){
            int firsti = booking[0]-1;
            int lasti = booking[1];
            int seatsi = booking[2];

            difference[firsti]+=seatsi;
            if(lasti<n){
                difference[lasti]-=seatsi;
            }        
        }

        int currentSum=0;

        for(int i=0;i<n;i++){
            currentSum+=difference[i];
            answer[i]=currentSum;
        }

        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of flights:");
        int n = sc.nextInt();
        
        System.out.println("Enter row size of bookings array:");
        int m=sc.nextInt();
        
        System.out.println("Enter bookings array:");
        // int[][] bookings = {{1,2,10},
        //                     {2,3,20},
        //                     {2,5,25}};
        
        int[][] bookings=new int[m][3];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<3;j++){
                bookings[i][j]=sc.nextInt();
            }
        }
        
        System.out.println(Arrays.toString(totalSeatsReserved(n,bookings)));
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n^2)
//where n is the length of array bookings