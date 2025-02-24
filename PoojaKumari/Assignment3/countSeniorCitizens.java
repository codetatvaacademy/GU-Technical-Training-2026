import java.util.Scanner;
public class countSeniorCitizens {
    public static int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            int first=Character.getNumericValue(details[i].charAt(11));
            int second=Character.getNumericValue(details[i].charAt(12));
            if(first>6 ||first==6  && second!=0 ){
                count++;
            }
            
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length Of array:");
        int n=sc.nextInt();
        String[] details=new String[n];
        System.out.print("Enter the string of array: ");
        for(int i=0;i<n;i++){
            details[i]=sc.next();
        }
        int result=countSeniors(details);
        System.out.print(result);
        sc.close();

    }
    
}
