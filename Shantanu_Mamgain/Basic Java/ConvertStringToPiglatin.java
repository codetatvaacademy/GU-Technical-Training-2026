import java.util.Scanner;

public class ConvertStringToPiglatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String english = sc.nextLine();

        StringBuilder str = new StringBuilder();
        for(int i =1 ; i<english.length(); i++){
            str.append(english.charAt(i));
        }
        str.append(english.charAt(0));
        str.append("ay");

        System.out.println(str);
        sc.close();
    }
}