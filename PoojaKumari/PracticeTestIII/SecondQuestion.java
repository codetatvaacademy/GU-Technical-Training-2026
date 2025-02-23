import java.util.Scanner;
import java.*;
public class SecondQuestion {
    public static int beautifulStringLength(String str){
        int length=0;
        int start=0;
        int  end=0;
        int maxlength=0;
        while(end<str.length()){
            if(checkVowelOrder(end)){
                length=end-start+1;
                end++;
            }
            else{
                start=end;
                length=end-start+1;
            }
            maxlength=Math.max(maxlength,length);

            if (length==str.length()){
                return 0;
            }
        }
        return maxlength;

    }
    public boolean checkVowelOrder(String str){
        int[] arr=new int[128];
        int frequecy=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) =='a' && str.charAt(i+1) =='a' || str.charAt(i+1) =='e' &&
             str.charAt(i+2)=='a'|| str.charAt(i+2) =='e' || str.charAt(i+2)=='i' &&
             str.charAt(i+3)=='a'|| str.charAt(i+3) =='e' || str.charAt(i+3)=='i'|| str.charAt(i+3)=='o' &&
             str.charAt(i+4)=='a'|| str.charAt(i+4) =='e' || str.charAt(i+4)=='i'|| str.charAt(i+4)=='o' || str.charAt(i+4)=='u'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();
        int result=0;
        result=beautifulStringLength(str);
        System.out.println(result);

        sc.close();

    }
    
}
