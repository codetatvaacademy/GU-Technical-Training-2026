// 11. Container With Most Water

import java.util.Scanner;

class containerWithMostWater{
    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int ans = 0;
        int res = 0;
        while (i < j) {
            if (height[i] <= height[j]) {
                res = height[i] * (j - i);
                ++i;
            } else {
                res = height[j] * (j - i);
                --j;
            }
            if (res > ans){
                ans = res;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            height[i] = sc.nextInt();
        }
        System.out.println(maxArea(height));
        sc.close();
    }
}

//Time Complexity: O(n)
//Spce Complexity: O(1)