import java.util.Scanner;

public class Question1 {
    public static int countOccurence(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target=sc.nextInt();
        int count=0;
        count=countOccurence(arr, target);
        System.out.print(count);
        sc.close();
    }
    
}
