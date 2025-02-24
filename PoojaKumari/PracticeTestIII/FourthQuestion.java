import java.util.*;
public class FourthQuestion {
    public static int longestSemiRepetitiveSubString(String str){
        int length=0;
        int[] frequency=new int[10];
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                frequency[i]++;
            }
        }
        // int start=0;
        int end=0;
        while(end<str.length()){
            
        }

        return length;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String consisting Of digits from 0 to 9:");
        String str=sc.nextLine();
        int length=0;
        length=longestSemiRepetitiveSubString(str);
        System.out.println(length);
        sc.close();
    }
    
    
}
