import java.util.*;

public class MaximumAreaofaPieceofCakeAfterHorizontalandVerticalCuts {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int maxHeight = horizontalCuts[0] - 0;
        for(int i = 1; i < horizontalCuts.length; i++){
            maxHeight = Math.max(maxHeight,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        maxHeight = Math.max(maxHeight, h - horizontalCuts[horizontalCuts.length - 1]);

        int maxWidth = verticalCuts[0] - 0;
        for(int i = 1; i < verticalCuts.length; i++){
            maxWidth = Math.max(maxWidth,verticalCuts[i]-verticalCuts[i-1]);
        }
        maxWidth = Math.max(maxWidth,w - verticalCuts[verticalCuts.length - 1]);

        return (int)((1L*maxHeight*maxWidth)%1_000_000_007);
    }
    public static void main(String[] args) {
        MaximumAreaofaPieceofCakeAfterHorizontalandVerticalCuts obj = new MaximumAreaofaPieceofCakeAfterHorizontalandVerticalCuts();
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int n = sc.nextInt();
        int[] horizontalCuts = new int[n];

        for(int i = 0; i < n; i++){
            horizontalCuts[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] verticalCuts = new int[m];

        for(int i = 0; i < m; i++){
            verticalCuts[i] = sc.nextInt();
        }

        int result = obj.maxArea(h, w, horizontalCuts, verticalCuts);
        System.out.println(result);
    }
}
