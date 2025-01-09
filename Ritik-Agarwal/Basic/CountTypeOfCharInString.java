import java.util.Scanner;
public class CountTypeOfCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();
        int alphabet = 0, integer = 0, special=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)){
                alphabet++;
            }
            else if(ch>=48 && ch<=57){
                integer++;
            }
            else{
                special++;
            }
        }
        System.out.println(str + " has: ");
        System.out.println(alphabet + " Alphabets.");
        System.out.println(integer + " Integers.");
        System.out.println(special + " Special symbols.");
    }
}