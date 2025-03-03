import java.util.Scanner;
public class ArrayStringEquivalency {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum1="";
        String sum2="";
        for(int i=0;i<word1.length;i++){
            sum1+= word1[i];
        }
       for(int i=0;i<word2.length;i++){
            sum2+= word2[i];
       }
       if(sum1.equals(sum2)){
        return true;
       }
    return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Array:");
        int n=sc.nextInt();
        String[] word1=new String[n];
        System.out.print("Enter the strings:");
        for(int i=0;i<n;i++){
            word1[i]=sc.next();
        }
        System.out.print("Enter the length of 2nd Array:");
        int m=sc.nextInt();
        String[] word2=new String[m];
        System.out.print("Enter the strings:");
        for(int i=0;i<m;i++){
            word2[i]=sc.next();
        }
         boolean result = arrayStringsAreEqual(word1,word2);
         System.out.print(result);
        sc.close();
    }
}
