import java.util.Scanner;

public class HIndex{
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n+1];
        for(int i = 0; i < n; i++){
            if(citations[i]>=n){
                arr[n]++;
            }else{
                arr[citations[i]]++;
            }
        } 
        for(int i = arr.length - 2; i >= 0; i-- ){
            arr[i] = arr[i] + arr[i+1];
        }
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i]>=i){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of array:");
        int n = sc.nextInt();
        int[] citations = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            citations[i] = sc.nextInt();
        }
        System.out.println("The researcher's index will be:" + hIndex(citations));
    }
}