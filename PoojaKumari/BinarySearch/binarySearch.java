import java.util.Scanner;

public class binarySearch {
    public static int  search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n=sc.nextInt();
        System.out.print("Enter target valule:");
        int target=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        int answer=0;
        answer=search(nums,target);
        System.out.print("Target found at index:"+answer);
        sc.close();
    }
}
