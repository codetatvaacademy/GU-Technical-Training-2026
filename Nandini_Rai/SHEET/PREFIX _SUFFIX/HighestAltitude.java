import java.util.Scanner;

public class HighestAltitude {
        public int largestAltitude(int[] gain) {
            int highest_Altitude = 0;
            int points = 0;
            for(int i=0;i<gain.length;i++){
                points+=gain[i];
                highest_Altitude =Math.max(highest_Altitude,points);
            }
            return highest_Altitude;
        }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int gain[] = new int[n];
        for(int i=0;i<gain.length;i++){
            gain[i] = sc.nextInt();
        }
        HighestAltitude ha = new HighestAltitude();
        System.out.println(ha.largestAltitude(gain));

    }
}
