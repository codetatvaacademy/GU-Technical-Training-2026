import java.util.Scanner;

public class uppercasecheck {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        char ch = sc.next().charAt(0);
      
if(ch>=65&&ch<=90){
    System.out.println("The alphabet is in uppercase");
}
else
System.out.println("The given character is lowecase");
        }
    }
