import java.util.Scanner;

public class TrappingRainWater {
        public int trap(int[] height) {
            int i = 0;
            int j = height.length - 1;
            int tap = 0;
            int leftMost = 0;
            int rightMost = 0;
            while (i < j) {
                if (height[i] < height[j]) {
                    if (height[i] > leftMost) {
                        leftMost = height[i];
                    } else {
                        tap += leftMost - height[i];
                    }
                    i++;
                } else {
                    if (height[j] > rightMost) {
                        rightMost = height[j];
                    } else {
                        tap += rightMost - height[j];
                    }
                    j--;
                }
            }
            return tap;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int height[] = new int[n];
            for(int i=0;i<height.length;i++){
                height[i] = sc.nextInt();
            }
            TrappingRainWater tw = new TrappingRainWater();
            System.out.println(tw.trap(height));
        }
}
