public class Smallestdivisor {
    public static int bSerch(int[] b, int threshold) {
        int min = 1;
        int max = Integer.MIN_VALUE;

        for (int i : b) {
            max = Math.max(max, i);
        }

        while (min <= max) {
            int mid = (max + min) / 2;
            int f = 0;

            for (int i : b) {
                f += (i + mid - 1) / mid;
            }

            if (f > threshold) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] b = { 1, 2, 5, 9 };
        int threshold = 6;

        int result = bSerch(b, threshold);
        System.out.println("Smallest Divisor: " + result);
    }
}
