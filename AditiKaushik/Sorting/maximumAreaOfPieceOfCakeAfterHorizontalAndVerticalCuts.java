// 1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts

import java.util.Arrays;
import java.util.Scanner;

class maximumAreaOfPieceOfCakeAfterHorizontalAndVerticalCuts{
    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int mH = horizontalCuts[0];
        for(int i = 1; i <= horizontalCuts.length; i++){
            int diff = 0;
            if(i == horizontalCuts.length){
                diff = h - horizontalCuts[i-1];
            }
            else{
                diff = horizontalCuts[i] - horizontalCuts[i-1];
            }
            mH = Math.max(mH, diff);
        }
        int mW = verticalCuts[0];
        for(int i = 1; i <=verticalCuts.length; i++){
            int diff = 0;
            if(i == verticalCuts.length){
                diff = w - verticalCuts[i-1];
            }
            else{
                diff = verticalCuts[i] - verticalCuts[i-1];
            }
            mW = Math.max(mW, diff);
        }
        long ans = (long) mH * mW;
        return (int) (ans % 1000_000_007);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of cake: ");
        int h = sc.nextInt();
        System.out.println("Enter the width of cake: ");
        int w = sc.nextInt();
        System.out.println("Enter the size of horizontal cuts array: ");
        int hSize = sc.nextInt();
        int[] horizontalCuts = new int[hSize];
        for(int i =0; i < hSize; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            horizontalCuts[i] = sc.nextInt();
        }
        System.out.println("Enter the size of vertical cuts array: ");
        int vSize = sc.nextInt();
        int[] verticalCuts = new int[vSize];
        for(int i =0; i < vSize; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            verticalCuts[i] = sc.nextInt();
        }
        System.out.println(maxArea(h, w, horizontalCuts, verticalCuts));
        sc.close();
    }
}

//Time Complexity: O(m log m + n log n)
//Space Complexity: O(1)