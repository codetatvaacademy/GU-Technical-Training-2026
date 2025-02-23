import java.util.*;
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxWater = Integer.MIN_VALUE;
        while (i < j) {
            if (height[i] > height[j]) {
                maxWater = Math.max((height[j] * (j - i)), maxWater);
                j--;
            } else if (height[i] < height[j]) {
                maxWater = Math.max((height[i] * (j - i)), maxWater);
                i++;
            } else {
                maxWater = Math.max((height[i] * (j - i)), maxWater);
                i++;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }

        int maxWater = obj.maxArea(height);
        System.out.println(maxWater);
    }
}
