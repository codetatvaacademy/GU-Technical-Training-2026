import java.util.*;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] < leftMax){
                    total += leftMax - height[left];
                }else{
                    leftMax = height[left];
                }
                left++;
            }else{
                if(height[right] < rightMax){
                    total += rightMax - height[right];
                }else{
                    rightMax = height[right];
                }
                right--;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        TrappingRainWater obj = new TrappingRainWater();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];

        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        int total = obj.trap(height);
        System.out.println(total);
        sc.close();
    }
}
