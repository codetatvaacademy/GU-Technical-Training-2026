import java.util.Scanner;

public class problem10 {
    public static String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
            sum+=shifts[i]%26;
            shifts[i]=sum;
        }
        String str="";
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            
            str+=(char) ((( (int) ch - 'a' + shifts[i])%26)+'a');
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        String s=shiftingLetters(str,arr);
            System.out.println(s);
    }
}
