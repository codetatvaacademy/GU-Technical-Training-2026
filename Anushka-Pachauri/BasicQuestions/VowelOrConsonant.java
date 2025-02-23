import java.util.*;
public class VowelOrConsonant{
    static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    static boolean isConsonant(char ch){
        return (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u');
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if(isVowel(ch)){
            System.out.println("Character is a Vowel");
        }
        else if(isConsonant(ch)){
            System.out.println("Character is a Consonant");
        }
    }
}