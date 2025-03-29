import java.util.Scanner;

class HIndex{
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
        System.out.println("Enter the number of elements of the array:");
        int n = sc.nextInt();
        int[] citations = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            citations[i] = sc.nextInt();            
        }
        System.out.println("the researcher's index5 is:" + hIndex(citations));
    }
}

//time complexity of the function is : O(n)
//space complexity of the function is : O(n)

//time complexity of the function is : O(n) 
//space complexity of the function is : O(n)