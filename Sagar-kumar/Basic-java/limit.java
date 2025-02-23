import java.util.Scanner;

public class limit{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter lower limit");
int lowerlimit = sc.nextInt();
System.out.println("Enter upper limit ");
int upperlimit = sc.nextInt();
for(int i =lowerlimit+1; i<upperlimit; i++){
    if(i%2==0)
    System.out.println(i);
}
}
}
