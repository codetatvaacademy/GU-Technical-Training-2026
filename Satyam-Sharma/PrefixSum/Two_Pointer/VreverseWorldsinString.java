import java.util.Scanner;

public class VreverseWorldsinString {
    public static void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        reverse(arr, 0, arr.length - 1);
        int l = 0;
        int r = 0;
        int i = 0;
        while (i < arr.length) {
            while (i < arr.length && arr[i] != ' ') {
                arr[r++] = arr[i++];
            }
            if (l < r) {
                reverse(arr, l, r - 1);
                if (r < arr.length) {
                    arr[r++] = ' ';
                }
                l = r;
            }
            i++;

        }
        return new String(arr, 0, r - (r > 0 && arr[r - 1] == ' ' ? 1 : 0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
        
    }
}
