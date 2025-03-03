import java.util.Arrays;
import java.util.Scanner;

public class MaximumUnitsOnTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        int maxUnits=0;
        for(int[] box:boxTypes){
            int boxCount = Math.min(box[0],truckSize);
            maxUnits += boxCount * box[1];
            truckSize -= boxCount;
            if(truckSize == 0) break;
        }
        return maxUnits;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int boxTypes[][] = new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
           boxTypes[i][j] = sc.nextInt();
        }
    }
    int truckSize = sc.nextInt();
    MaximumUnitsOnTruck mt = new MaximumUnitsOnTruck();
    System.out.println(mt.maximumUnits(boxTypes, truckSize));
    }  
}
