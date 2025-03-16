import java.util.Scanner;
public class ContainerWithMostWater {
        public int maxArea(int[] height) {
            int i=0;
            int j=height.length-1;
            int maxArea =0;
            while(i<j){
                int area = Math.min(height[i],height[j])*(j-i);
                maxArea = Math.max(maxArea,area);
                if(height[i]<height[j])
                i++;
                else
                j--;
            }
            return maxArea;
        }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int height[] = new int[n];
     for(int i=0;i<height.length;i++){
        height[i] = sc.nextInt();
     }
     ContainerWithMostWater cw = new ContainerWithMostWater();
     System.out.println(cw.maxArea(height));
    }

}
