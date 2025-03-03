import java.util.Arrays;
import java.util.Scanner;

public class HeightChceker {
    public int heightChecker(int[] heights) {
        int expected[] = new int[heights.length];
        int k=0;
        for(int i=0;i<heights.length;i++){
            expected[i] = heights[k++];
        }
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int heights[] = new int[n];
        for(int i=0;i<heights.length;i++){
           heights[i] = sc.nextInt();
        }
        HeightChceker hc = new HeightChceker();
}
}
