package Sorting;

import java.util.*;

public class maximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long maxHeight = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        long maxWidth = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);

        for (int i = 1; i < horizontalCuts.length; i++) {
            maxHeight = Math.max(maxHeight, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        for (int i = 1; i < verticalCuts.length; i++) {
            maxWidth = Math.max(maxWidth, verticalCuts[i] - verticalCuts[i - 1]);
        }

        long area = (maxHeight * maxWidth) % 1000000007;

        return (int) area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height and width of the cake: ");
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        System.out.print("Enter number of horizontal cuts: ");
        int hCutsCount = scanner.nextInt();
        int[] horizontalCuts = new int[hCutsCount];
        System.out.println("Enter horizontal cuts:");
        for (int i = 0; i < hCutsCount; i++) {
            horizontalCuts[i] = scanner.nextInt();
        }

        System.out.print("Enter number of vertical cuts: ");
        int vCutsCount = scanner.nextInt();
        int[] verticalCuts = new int[vCutsCount];
        System.out.println("Enter vertical cuts:");
        for (int i = 0; i < vCutsCount; i++) {
            verticalCuts[i] = scanner.nextInt();
        }

        scanner.close();

        maximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts obj = new maximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();
        int result = obj.maxArea(h, w, horizontalCuts, verticalCuts);

        System.out.println("Maximum area of a piece of cake: " + result);
    }
}
