import java.util.*;
class Problem1{
    public static int findFirstOccurence(int[] arr, int target){//O(log n)
        int start=0;
        int end=arr.length-1;
        int first=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return first;
    }
    public static int findLastOccurence(int[] arr, int target){//O(log n)
        int start=0;
        int end=arr.length-1;
        int last=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                last=mid;
                start=mid+1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return last;
    }
    public static int countOccurences(int[] arr, int target){//O(1)
        int first=findFirstOccurence(arr,target);
        int last=findLastOccurence(arr,target);
        if(first==-1){
            return -1;
        }
        return last-first+1;
    }
    public static void main(String arggs[]){//O(n)
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        System.out.println("Enter a sorted array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        int result=countOccurences(arr,target);
        if(result==-1){
            System.out.println("Target not found");
        }
        else{
            System.out.println(result);
        }
    }
}
//Time Complexity for the complete program:O(nlog n)
//Time Complexity for the findOccurences() function or the main logic: O(log n)
//Space Complexity for the complete program:O(n)
//Space Complexity for the findOccurences() function or the main logic: O(1)