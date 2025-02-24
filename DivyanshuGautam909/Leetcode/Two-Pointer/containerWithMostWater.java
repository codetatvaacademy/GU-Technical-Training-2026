import java.util.Scanner;

public class containerWithMostWater {
    public int maxArea(int[] height) {
        int MaxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int current = Math.min(height[left], height[right]);
            int area = current * (right - left);
            MaxArea = Math.max(MaxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return MaxArea;
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

        containerWithMostWater obj = new containerWithMostWater();
        int result = obj.maxArea(height);

        System.out.println("Maximum water that can be contained: " + result);
    }
}
