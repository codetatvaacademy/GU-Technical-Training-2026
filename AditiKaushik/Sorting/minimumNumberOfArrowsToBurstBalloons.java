// 452. Minimum Number of Arrows to Burst Balloons

import java.util.Arrays;
import java.util.Scanner;

class minimumNumberOfArrowsToBurstBalloons{
    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrowCount = 0;
        long possibleEnd = Long.MIN_VALUE;
        for (int [] p: points) {
            if (p[0] > possibleEnd) {
                possibleEnd = p[1];
                arrowCount += 1;
            }
        }
        return arrowCount;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[][] points = new int[size][2];
        for (int i = 0; i < points.length; i++) {
            System.out.println("Enter start: ");
            points[i][0] = sc.nextInt();
            System.out.println("Enter end: ");
            points[i][1] = sc.nextInt();
        }
        System.out.println(findMinArrowShots(points));
        sc.close();
    }
}

//Time Complexity: O(nlogn)
//Space Complexity: O(1)