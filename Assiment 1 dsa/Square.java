public class Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a three-digit number");
        int n = s.nextInt();

        int m = (n / 10) % 10;
        int sq = m * m;

        System.out.println(sq);
        s.close();
    }
}
