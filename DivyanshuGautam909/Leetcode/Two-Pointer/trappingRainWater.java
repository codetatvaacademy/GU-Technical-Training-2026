import java.util.Scanner;

public class trappingRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int trap = 0;
        int leftMax = 0;
        int rightMax = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    trap += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    trap += rightMax - height[right];
                }
                right--;
            }
        }
        return trap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] height = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        scanner.close();

        trappingRainWater obj = new trappingRainWater();
        int result = obj.trap(height);

        System.out.println("Amount of trapped rainwater: " + result);
    }
}
