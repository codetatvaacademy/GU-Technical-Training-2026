import java.util.Scanner;
public class SuffleStrings {
    public  static String restoreString(String s, int[] indices) {
        int n=indices.length;
        char[] ch=new char[n];
        for(int i=0;i<indices.length;i++){
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.print("Enter the length of indices:");
        int m=sc.nextInt();
        int[] indices=new int[m];
        System.out.print("Enter indices:");
        for(int i=0;i<m;i++){
            indices[i]=sc.nextInt();
        }
        String str=restoreString(s,indices);
        System.out.print(str);
        sc.close();
  
    }
}
