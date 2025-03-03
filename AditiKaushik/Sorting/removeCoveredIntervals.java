// 1288. Remove Covered Intervals

import java.util.Scanner;

class removeCoveredIntervals{
    private static boolean check(int x, int[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i][0] <= a[x][0] && a[i][1] >= a[x][1] && x != i) {
                return true;
            }
        }
        return false;
    }

    public static int removeCovered_Intervals(int[][] intervals) {
        int n = intervals.length;
        for (int i = 0; i < intervals.length; i++) {
            if (check(i, intervals)) {
                n--;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[][] intervals = new int[size][2];
        for (int i = 0; i < intervals.length; i++) {
            System.out.println("Enter the start of interval " + (i+1) + " : ");
            intervals[i][0] = sc.nextInt();
            System.out.println("Enter the end of interval: " + (i+1) + " : ");
            intervals[i][1] = sc.nextInt();
        }
        System.out.println(removeCovered_Intervals(intervals));
        sc.close();
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(1)