import java.util.*;
public class Piglatin{
    static String toPiglatin(String str){
        String piglatinstr="";
        String[] words=str.split(" ");
        for(String word: words){
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') && i==0){
                    piglatinstr+=" "+word+"yay";
                    break;
                }
                else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    piglatinstr+=" "+word.substring(i)+word.substring(0,i)+"ay";
                    break;
                }
            }
        }
        return piglatinstr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str.trim();
        str=str.toLowerCase();
        System.out.println("Piglatin string: "+toPiglatin(str));
    }
}