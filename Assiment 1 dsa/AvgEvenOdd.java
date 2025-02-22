import java.util.Scanner;

public class AvgEvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int es = 0, ec = 0, os = 0, oc = 0, n;

        while (true) {
            n = s.nextInt();
            if (n == -1)
                break;

            if (n % 2 == 0) {
                es += n;
                ec++;
            } else {
                os += n;
                oc++;
            }
        }

        System.out.println(ec == 0 ? 0 : es / ec);
        System.out.println(oc == 0 ? 0 : os / oc);

        s.close();
    }
}
