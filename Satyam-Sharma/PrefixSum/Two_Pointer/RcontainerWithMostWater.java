import java.util.Scanner;

public class RcontainerWithMostWater {
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                max = Math.max(max, (r - l) * height[l]);
                l++;
            } else {
                max = Math.max(max, (r - l) * height[r]);
                r--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println(maxArea(height));
        
    }
}
