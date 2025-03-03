import java.util.Arrays;
import java.util.Scanner;

public class WidestVerticalAreaBetweenTwoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a,b )->a[0]-b[0]);
        int maxArea=0;
        for(int i=1;i<points.length-1;i++){
            int maxWidth = points[i][0]-points[i-1][0];
        maxArea = Math.max(maxArea,maxWidth);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int points[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;i<n;j++){
                points[i][j] = sc.nextInt();
            }
        }
        WidestVerticalAreaBetweenTwoPoints ws = new WidestVerticalAreaBetweenTwoPoints();
        System.out.println(ws.maxWidthOfVerticalArea(points));
    }
   
}
