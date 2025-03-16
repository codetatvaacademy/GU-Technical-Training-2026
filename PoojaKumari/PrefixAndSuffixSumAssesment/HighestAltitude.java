import java.util.Scanner;

public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int n=gain.length;
        int highestAltitude=0;
        int currentAltitude=0;
        for(int i=0;i<n;i++){
            currentAltitude+=gain[i];
            highestAltitude=Math.max(currentAltitude,highestAltitude);
        }
        return highestAltitude;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=largestAltitude(nums);
        System.out.print(result);
        sc.close();
    }
    
}
