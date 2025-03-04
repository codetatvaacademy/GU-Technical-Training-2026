import java.util.Scanner;

class ReverseString{
    public static void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        char[] s = input.toCharArray();
        reverseString(s);
        System.out.println("Reversed string:");
        System.out.println(new String(s));
    }

}