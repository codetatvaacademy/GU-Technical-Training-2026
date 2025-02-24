public class Ship {
    public static void bSerch(int[] b, int days) {
        // --------------------------------------------------------------------------------
        int max = 0;
        for (int i : b) {
            max += i;
        }
        // --------------------------------------------------------------------------------
        int min = 1;
        for (int i : b) {
            if (min < i) {
                min = i;
            }
        }
        // --------------------------------------------------------------------------------
        while (min <= max) {
            int mid = (min + max) / 2;
            int total = 0;
            int D = 1;
            for (int i : b) {
                if (total + i > mid) {
                    total = i;
                    D++;
                } else {
                    total += i;
                }
            }
            if (D <= days) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }
        System.out.println(min);

    }

    public static void main(String[] args) {
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        bSerch(b, days);
    }
}
